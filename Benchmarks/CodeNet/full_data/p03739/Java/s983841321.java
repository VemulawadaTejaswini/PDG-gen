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
		ArrayList<Integer> tmp = nextIntArray();
		int[] list = new int[N];
		for(int i = 0; i < N; i++){
			list[i] = tmp.get(i);
		}
		int oddCount = 0;
		int evenCount = 0;
		int[] oddSum = new int[N];//1, -1, 1, -1
		int[] evenSum = new int[N];//-1, 1 ,-1 ,1
		if(list[0] == 0){
			oddSum[0] = 1;
			evenSum[0] = -1;
			oddCount++;
			evenCount++;
		}else{
			if(list[0] < 0){
				oddCount += Math.abs(list[0]) + 1;
				oddSum[0] = 1;
				evenSum[0] = list[0];
			}else{
				evenCount += Math.abs(list[0]) + 1;
				evenSum[0] = -1;
				oddSum[0] = list[0];
			}
		}
		for(int i = 1; i < N; i++){
			oddSum[i] = oddSum[i - 1] + list[i];
			evenSum[i] = evenSum[i - 1] + list[i];
			if((oddSum[i - 1] < 0 && oddSum[i] > 0) || (oddSum[i - 1] > 0 && oddSum[i] < 0)){
				
			}else{
				if((oddSum[i - 1] > 0)){
					oddCount += oddSum[i] + 1;
					oddSum[i] = -1;
				}else{
					oddCount += Math.abs(oddSum[i]) + 1;
					oddSum[i] = 1;
				}
			}
			if((evenSum[i - 1] < 0 && evenSum[i] > 0) || (evenSum[i - 1] > 0 && evenSum[i] < 0)){
				
			}else{
				if((evenSum[i - 1] > 0)){
					evenCount += evenSum[i] + 1;
					evenSum[i] = -1;
				}else{
					evenCount += Math.abs(evenSum[i]) + 1;
					evenSum[i] = 1;
				}
			}
		}
		myout(Math.min(evenCount, oddCount));
	}
	//Method addition frame start



	//Method addition frame end
}
