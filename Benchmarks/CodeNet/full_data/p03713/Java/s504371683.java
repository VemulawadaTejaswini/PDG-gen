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
  ArrayList<Long> one = nextLongArray();
  long H = one.get(0);
  long W = one.get(1);
  
  long output = 1L << 40;
  long[] list = new long[3];
  for(long i = 1; i <= H - 1; i++){
  	list[0] = i;
  	list[1] = (H / i) / 2;
  	list[2] = (H - i + 1) / 2;
    long tatemax = Math.max(i, Math.max((H - i) / 2, (H - i + 1) / 2));
    long tatemin = Math.min(i, Math.min((H - i) / 2, (H - i + 1) / 2));
    output = Math.min(output, (tatemax - tatemin) * W);
    long yoko1 = W / 2;
    long yoko2 = W - yoko1;
    list[0] = i * W;
  	list[1] = (H - i) * yoko1;
  	list[2] = (H - i) * yoko2;
    long yokomax = Math.max(i * W, Math.max((H - i) * yoko1, (H - i) * yoko2));
    long yokomin = Math.min(i * W, Math.min((H - i) * yoko1, (H - i) * yoko2));
    output = Math.min(output, yokomax - yokomin);
  }
  long tmp = H;
  H = W;
  W = tmp;
  for(long i = 1; i <= H - 1; i++){
  	list[0] = i;
  	list[1] = (H / i) / 2;
  	list[2] = (H - i + 1) / 2;
    long tatemax = Math.max(i, Math.max((H - i) / 2, (H - i + 1) / 2));
    long tatemin = Math.min(i, Math.min((H - i) / 2, (H - i + 1) / 2));
    output = Math.min(output, (tatemax - tatemin) * W);
    long yoko1 = W / 2;
    long yoko2 = W - yoko1;
    list[0] = i * W;
  	list[1] = (H - i) * yoko1;
  	list[2] = (H - i) * yoko2;
    long yokomax = Math.max(i * W, Math.max((H - i) * yoko1, (H - i) * yoko2));
    long yokomin = Math.min(i * W, Math.min((H - i) * yoko1, (H - i) * yoko2));
    output = Math.min(output, yokomax - yokomin);
  }
  
  myout(output);
	}
	//Method addition frame start



	//Method addition frame end
}
