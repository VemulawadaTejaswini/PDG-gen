import java.util.*; import java.io.*; import java.math.*;
public class Main{
	static void solve(){//Here is the main function
      ArrayList<Integer> one = nextIntArray();
      int N = one.get(0);
      int M = one.get(1);
      Node[] list = new Node[N];
      for(int i = 0; i < N; i++){
        list[i] = new Node(nextLongArray());
      }
      long max = 0;
      int p = 3;
      for(int i = 0; i < (1 << p); i++){
        ArrayList<Integer> v = new ArrayList<>();
        for(int j = 0; j < p; j++){
          if((i & (1 << j)) != 0){
            v.add(1);
          }else{
            v.add(-1);
          }
        }
        long sum = 0;
        long L = 0;
        long C = 0;
        long R = 0;
        Arrays.sort(list, new OriComparator(v));
        for(int j = 0; j < M; j++){
          L += list[j].L;
          C += list[j].C;
          R += list[j].R;
        }
        sum += Math.abs(L) + Math.abs(C) + Math.abs(R);
        max = Math.max(max, sum);
      }
      myout(max);
	}
	//Method addition frame start

static class Node{
  long L;
  long C;
  long R;
  Node(ArrayList<Long> list){
    L = list.get(0);
    C = list.get(1);
    R = list.get(2);
  }
}

static class OriComparator implements Comparator<Node>{
  ArrayList<Integer> change;
  OriComparator(ArrayList<Integer> change){
    this.change = change;
  }
  public int compare(Node mae, Node ato){
    long sm = mae.L * change.get(0) + mae.C * change.get(1) + mae.R * change.get(2);
    long sa = ato.L * change.get(0) + ato.C * change.get(1) + ato.R * change.get(2);
    if(sm < sa){
      return -1;
    }else{
      return 0;
    }
  }
}
  
	//Method addition frame end

	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<>(1024);
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
	static HashMap<Integer, String> CONVSTR = new HashMap<>();
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
		ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Integer.parseInt(input.get(i)));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<>(input.size());
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
}
