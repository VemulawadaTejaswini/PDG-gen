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
		int N = nextInt();
      ArrayList<Long> list = nextLongArray();
      int mod = 1000000007;
      long[] onbit = new long[61];
      long[] offbit = new long[61];
      Arrays.fill(onbit, 0);
      Arrays.fill(offbit, 0);
      for(int i = 0; i < N; i++){
        long now = list.get(i);
        String nowS = "0000000000000000000000000000000000000000000000000000000000000" + Long.toBinaryString(now);
        String tmp = "";
        for(int j = 0; j < nowS.length(); j++){
          tmp = nowS.substring(j, j + 1) + tmp;
        }
        nowS = tmp;
        int count = 0;
        while(count < 61){
          if(nowS.substring(count, count + 1).equals("1")){
            onbit[count]++;
          }else{
            offbit[count]++;
          }
          count++;
        }
        
      }
      long output = 0;
      for(int i = 0; i < 61; i++){
        output += onbit[i] * offbit[i] * originPow(2, i, mod);
        output %= mod;
      }
      myout(output);
	}
	//Method addition frame start
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
