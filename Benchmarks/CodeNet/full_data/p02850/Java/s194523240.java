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
	static void solve(){//Here is the main function
      int N = nextInt();
      Node[] list = new Node[N];
      for(int i = 0; i < N; i++){
        list[i] = new Node();
      }
      HashMap<String, Edge> map = new HashMap<String, Edge>();
      for(int i = 0; i < N - 1; i++){
        ArrayList<Integer> tmp = nextIntArray();
        int L = tmp.get(0) - 1;
        int R = tmp.get(1) - 1;
        list[L].child.add(R);
        list[R].child.add(L);
        map.put(String.valueOf(L) + ":" + String.valueOf(R), new Edge(i));
      }
      int maxColor = 0;
      ArrayDeque<Integer[]> queue = new ArrayDeque<Integer[]>();
      Integer[] first = new Integer[2];
      first[0] = 0;
      first[1] = -1;
      queue.add(first);
      list[0].access = true;
      while(queue.size() > 0){
        Integer[] now = queue.pollFirst();
        int index = now[0];
        int used = now[1];
        ArrayList<Integer> child = list[index].child;
        int c = 1;
        for(int i = 0; i < child.size(); i++){
          if(!list[child.get(i)].access){
            if(c == used){
              c++;
            }
            int L = index;
            int R = child.get(i);
            if(L > R){
              int tmp = L;
              L = R;
              R = tmp;
            }
            Edge e = map.get(String.valueOf(L) + ":" + String.valueOf(R));
            e.color = c;
            map.put(String.valueOf(L) + ":" + String.valueOf(R), e);
            list[child.get(i)].access = true;
            Integer[] add = new Integer[2];
            add[0] = child.get(i);
            add[1] = c;
            queue.addLast(add);
            maxColor = Math.max(maxColor, c);
            c++;
          }
        }
      }
      myout(maxColor);
      String[] output = new String[N - 1];
      Iterator it = map.keySet().iterator();
      while(it.hasNext()){
        Edge e = map.get((String)it.next());
        output[e.no] = String.valueOf(e.color);
      }
      myout(myconv(output, 9));
	}
	//Method addition frame start

static class Node{
  ArrayList<Integer> child = new ArrayList<Integer>();
  boolean access = false;
  Node(){}
}
  
static class Edge{
  int no;
  int color = -1;
  Edge(int no){
    this.no = no;
  }
}
  

	//Method addition frame end
}
