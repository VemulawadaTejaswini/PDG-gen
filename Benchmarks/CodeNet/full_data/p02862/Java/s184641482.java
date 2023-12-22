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
	static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
	static PrintWriter out = new PrintWriter(System.out);
	static void flush(){out.flush();}
	static void myout(Object t){out.println(t);}
	static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
	static String next(){return ii.next();}
	static boolean hasNext(){return ii.hasNext();}
	static int nextInt(){return Integer.parseInt(next());}
	static long nextLong(){return Long.parseLong(next());}
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
	static HashMap<Integer, String> CONVSTR = new HashMap<Integer, String>();
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
		Runtime rt = Runtime.getRuntime();
		long mae = System.currentTimeMillis();
		solve();flush();
		long ato = System.currentTimeMillis();
		myerr("time : " + (ato - mae) + "ms");
		myerr("memory : " + ((rt.totalMemory() - rt.freeMemory()) / 1024) + "KB");
	}
	//Don't have to see. end------------------------------------------
	static void solve(){//Here is the main function
		ArrayList<Integer> one = nextIntArray();
		int X = one.get(0);
		int Y = one.get(1);
		//1,2 2,4 3,6check
		int tmpX1 = X;
		int tmpY1 = Y;

		//2,1 4,2 6,3check
		int tmpX2 = X;
		int tmpY2 = Y;
		boolean isOK = false;
		int successLeft = 0;
		int successRight = 0;
		int leftCount = 1;
		int rightCount = 1;
		while(tmpX1 > 0 && tmpX2 > 0 && tmpY1 > 0 && tmpY2 > 0){
			if(tmpX1 / tmpY1 == 2){
				isOK = true;
				successLeft = leftCount;
			}
			if(tmpY2 / tmpX2 == 2){
				successRight = rightCount;
				isOK = true;
			}
			if(successRight != 0 && successLeft != 0){
				break;
			}
			tmpY1 -= 2;
			tmpX1--;

			tmpY2--;
			tmpX2 -= 2;
			if(successLeft == 0){
				leftCount++;
			}
			if(successRight == 0){
				rightCount++;
			}
			
			//myerr(tmpY1 + " " + tmpX1 + " " + tmpX2 + " " + tmpY2);
		}
		if(!isOK){
			myout(0);
			return;
		}
		long mod = 1000000007;
		Combination cm = new Combination(successRight + successLeft, mod);
		long output = cm.kaijo[successRight + successLeft - 2];
		output *= cm.inverse[successRight - 1];
		output %= mod;
		output *= cm.inverse[successLeft - 1];
		output %= mod;
		myout(output);
	}
	//Method addition frame start
static class Combination{
        long[] kaijo;
        long[] inverse;
        Combination(int N, long mod){
                kaijo = new long[N + 1];
                inverse = new long[N + 1];
                kaijo[0] = 1;
                inverse[0] = 1;
                for(int i = 1; i <= N; i++){
                        kaijo[i] = kaijo[i - 1] * (long)i % mod;
                        inverse[i] = inverse[i - 1] * this.pow((long)i, mod - 2, mod) % mod;
                }
        }
        private long pow(long x, long n, long m) {
        long ans = 1;
        while (n > 0) {
                if ((n & 1) == 1){
                  ans = ans * x;
                  if(m != -1){ans %= m;}
                }
                x = x * x;
                if(m != -1){x %= m;}
                n >>= 1;
        }
        return ans;
     }
}
static long originPow(long x, long n) {return originPow(x,n,-1);}
static long originPow(long x, long n, long m) {
        long ans = 1;
        while (n > 0) {
                if ((n & 1) == 1){
                  ans = ans * x;
                  if(m != -1){ans %= m;}
                }
                x = x * x;
                if(m != -1){x %= m;}
                n >>= 1;
        }
        return ans;
}
	//Method addition frame end

}
