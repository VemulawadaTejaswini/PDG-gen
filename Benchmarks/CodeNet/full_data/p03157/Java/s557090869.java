import java.util.*; import java.io.*; import java.math.*;
public class Main{
	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<String>(1024);
		int index = 0; int max; String read;
		InputIterator(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
				while((read = br.readLine()) != null){
					inputLine.add(read);
				}
			}catch(IOException e){}
			max = inputLine.size();
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
				return inputLine.get(index++);
			}else{
				throw new IndexOutOfBoundsException("There is no more input");
			}
		}
	}
	static HashMap<Integer, String> CONVSTR = new HashMap<Integer, String>();
	static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
	static PrintWriter out = new PrintWriter(System.out);
	static void flush(){out.flush();}
	static void myout(Object t){out.println(t);}
	static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
	static String next(){return ii.next();}
	static boolean hasNext(){return ii.hasNext();}
	static int nextInt(){return Integer.parseInt(next());}
	static long nextLong(){return Long.parseLong(next());}
	static double nextDouble(){return Double.parseDouble(next());}
	static ArrayList<String> nextStrArray(){return myconv(next(), 8);}
	static ArrayList<String> nextCharArray(){return myconv(next(), 0);}
	static ArrayList<Integer> nextIntArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<Integer>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Integer.parseInt(input.get(i)));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<Long>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Long.parseLong(input.get(i)));
		}
		return ret;
	}
	static String myconv(Object list, int no){//only join
		String joinString = CONVSTR.get(no);
		if(list instanceof String[]){
			return String.join(joinString, (String[])list);
		}else if(list instanceof ArrayList){
			return String.join(joinString, (ArrayList)list);
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
		return new ArrayList<String>(Arrays.asList(str.split(splitString)));
	}
	public static void main(String[] args){
		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); CONVSTR.put(0, "");
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
  static Node[][] list;
  static ArrayList<Group> group = new ArrayList<Group>();
	static void solve(){//Here is the main function
      ArrayList<Integer> one = nextIntArray();
      int H = one.get(0);
      int W = one.get(1);
      list = new Node[H][W];
      for(int i = 0; i < H; i++){
        ArrayList<String> tmp = nextCharArray();
        for(int j = 0; j < W; j++){
          list[i][j] = new Node(tmp.get(j));
        }
      }
      for(int i = 0; i < H; i++){
        for(int j = 0; j < W; j++){
          if(!list[i][j].access && list[i][j].s.equals("#")){
            group.add(new Group());
            bfs(i, j);
          }
        }
      }
      long output = 0;
      for(int i = 0; i < group.size(); i++){
       output += (long)group.get(i).white * group.get(i).black;
      }
      myout(output);
	}
	//Method addition frame start

static class Node{
  String s;
  boolean access = false;
  int count = 0;
  Node(String s){
    this.s = s;
  }
}
  
static class Group{
  int white = 0;
  int black = 1;
  Group(){}
}
  
static class QueueObject{
  int y;
  int x;
  QueueObject(int y, int x){
    this.y = y;
    this.x = x;
  }
}
  
static void bfs(int y, int x){
  int[] dy = {-1,0,1,0};
  int[] dx = {0,-1,0,1};
  ArrayDeque<QueueObject> queue = new ArrayDeque<QueueObject>();
  queue.add(new QueueObject(y, x));
  list[y][x].access = true;
  list[y][x].count = 0;
  while(queue.size() > 0){
    QueueObject now = queue.pollFirst();
    int nowY = now.y;
    int nowX = now.x;
    for(int i = 0; i < 4; i++){
      int nextY = nowY + dy[i];
      int nextX = nowX + dx[i];
      try{
        if(!list[nextY][nextX].access){
          if(list[nowY][nowX].count % 2 == 0 && list[nextY][nextX].s.equals(".")){
            list[nextY][nextX].count = list[nowY][nowX].count + 1;
            list[nextY][nextX].access = true;
            queue.add(new QueueObject(nextY, nextX));
            Group g = group.get(group.size() - 1);
            g.white++;
            group.set(group.size() - 1, g);
          }else if(list[nowY][nowX].count % 2 == 1 && list[nextY][nextX].s.equals("#")){
            list[nextY][nextX].count = list[nowY][nowX].count + 1;
            list[nextY][nextX].access = true;
            queue.add(new QueueObject(nextY, nextX));
            Group g = group.get(group.size() - 1);
            g.black++;
            group.set(group.size() - 1, g);
          }
        }
      }catch(Exception e){}
    }
  }
}
  
	//Method addition frame end
}
