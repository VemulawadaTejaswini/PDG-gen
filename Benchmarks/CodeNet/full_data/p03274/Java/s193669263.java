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
	ArrayList<Integer> one = nextIntArray();
	int N = one.get(0);
	int K = one.get(1);
	ArrayList<Integer> list = nextIntArray();
	int startIndex = list.indexOf(0);
	long output = (long)Math.pow(10,10);
	if(startIndex != -1){
		//0がある
		K--;
		if(K == 0){
			myout(0);
			return;
		}
	}else if(list.get(0) > 0){
		//始点が左端
		myout(Math.abs(list.get(K - 1)));
		return;
	}else if(list.get(K - 1) < 0){
		//始点が右端
		myout(Math.abs(list.get(K - 1)));
		return;
	}else{
		ArrayList<Integer> tmpList = new ArrayList<Integer>();
		boolean isZero = false;
		for(int i = 0; i < N; i++){
			if(!isZero && list.get(i) > 0){
				tmpList.add(0);
				isZero = true;
				startIndex = i;
			}
			tmpList.add(list.get(i));
		}
		list = tmpList;
		N++;
	}
	for(int i = 0; i < N - K; i++){
		int L = list.get(i);
		int R = list.get(i + K);
		if(L < 0 && R >= 0 || L <= 0 && R > 0){
			int firstLeft = Math.abs(L) + Math.abs(R - L);
			int firstRight = Math.abs(R) + Math.abs(R - L);
			output = Math.min(output, firstLeft);
			output = Math.min(output, firstRight);
		}
	}
	myout(output);
	}
	//Method addition frame start



	//Method addition frame end
}
