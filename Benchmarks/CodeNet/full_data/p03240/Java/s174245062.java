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
	static int[][] list;
  static HashSet[][] highList;
  static boolean[][] access;
  static int max;
	static void solve(){//Here is the main function
  int N = nextInt();
  max = 101;
  
  list = new int[max][max];
  highList = new HashSet[max][max];
  access = new boolean[max][max];
  for(int i = 0; i < max; i++){
    for(int j = 0; j < max; j++){
      highList[i][j] = new HashSet();
    }
  }
  int[][] check = new int[N][2];
  for(int i = 0; i < N; i++){
    ArrayList<Integer> tmp = nextIntArray();
    list[tmp.get(1)][tmp.get(0)] = tmp.get(2);
    int[] tmp2 = new int[2];
    tmp2[0] = tmp.get(1);
    tmp2[1] = tmp.get(0);
    check[i] = tmp2;
  }
  ArrayList<Integer[]> point = new ArrayList<Integer[]>();
  for(int i = 0; i < N; i++){
    if(list[check[i][0]][check[i][1]] != 0){
   	  Integer[] tmp = new Integer[2];
   	  tmp[0] = check[i][0];
   	  tmp[1] = check[i][1];
      point.add(tmp);
      bfs(check[i][0], check[i][1]);
    }
  }
  
  if(point.size() == 0){
    ArrayList<String> check2 = new ArrayList<String>();
    for(int i = 0; i < N; i++){
      check2.add(String.valueOf(check[i][0]) + ":" + String.valueOf(check[i][1]));
    }
    for(int i = 0; i < max; i++){
      for(int j = 0; j < max; j++){
        if(list[i][j] == 0 && !check2.contains(i + ":" + j)){
          myout(i + " " + j + " " + 1);
          return;
        }
      }
    }
  }else if(point.size() == 1){
    Integer[] tmp = point.get(0);
    myout(tmp[1] + " " + tmp[0] + " " + list[tmp[0]][tmp[1]]);
  }else{
    for(int i = 0; i < max; i++){
      for(int j = 0; j < max; j++){
        if(highList[i][j].size() == 1){
          Iterator output = highList[i][j].iterator();
          myout(j + " " + i + " " + (int)output.next());
          return;
        }
      }
    }
  }
  
  

	}
	//Method addition frame start

  static void bfs(int y, int x){
  	int[] dy = {-1,0,1,0};
    int[] dx = {0,-1,0,1};
    for(int i = 0; i < max; i++){
      Arrays.fill(access[i], false);
    }
    access[y][x] = true;
    ArrayDeque<QueueObject> queue = new ArrayDeque<QueueObject>();
    queue.add(new QueueObject(y, x, list[y][x]));
    while(queue.size() > 0){
      QueueObject now = queue.pollFirst();
      int nowY = now.y;
      int nowX = now.x;
      int value = now.c;
      highList[nowY][nowX].add(value);
      for(int i = 0; i < dy.length; i++){
        int nextY = nowY + dy[i];
        int nextX = nowX + dx[i];
        if(nextY >= 0 && nextY < max && nextX >= 0 && nextX < max){
          if(!access[nextY][nextX]){
            access[nextY][nextX] = true;
            queue.addLast(new QueueObject(nextY, nextX, value + 1));
          }
        }
      }
    }
  }
static class QueueObject{
	int y;
	int x;
	int c;
	QueueObject(int y, int x, int c){
		this.y = y;
		this.x = x;
		this.c = c;
	}
}

	//Method addition frame end
}
