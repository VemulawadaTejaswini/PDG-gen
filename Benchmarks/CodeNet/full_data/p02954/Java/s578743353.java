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
		ArrayList<String> list = nextCharArray();
		int N = list.size();
		int R = 0;
		int L = 0;
		int[] check = new int[N];
		for(int i = 0; i < N; i++){
			if(list.get(i).equals("R")){
				R++;
			}else{
				if(i == 0){
					continue;
				}
				if(list.get(i - 1).equals("R")){
					check[i - 1] = R;
					R = 0;
				}
			}
		}
		for(int i = N - 1; i >= 0; i--){
			if(list.get(i).equals("L")){
				L++;
			}else{
				if(i == N - 1){
					continue;
				}
				if(list.get(i + 1).equals("L")){
					check[i + 1] = L;
					L = 0;
				}
			}
		}
		if(L != 0){
			check[0] = L;
		}
		if(R != 0){
			check[N - 1] = R;
		}
		for(int i = 0; i < N - 1; i++){
			if(list.get(i).equals("R") && list.get(i + 1).equals("L")){
				int sum = check[i] + check[i + 1];
				if(sum % 2 == 0){
					check[i] = sum / 2;
					check[i + 1] = sum / 2;
				}else{
					int min = sum / 2;
					int max = (sum + 1) / 2;
					if(check[i] % 2 == 1){
						check[i] = max;
						check[i + 1] = min;
					}else{
						check[i] = min;
						check[i + 1] = max;
					}
				}
			}
		}
		String[] output = new String[N];
		for(int i = 0; i < N; i++){
			output[i] = String.valueOf(check[i]);
		}
		myout(myconv(output, 8));
	}
	//Method addition frame start




	//Method addition frame end
}
