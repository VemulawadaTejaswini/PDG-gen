import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	final public static int DIVISOR = 1000000007;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] strings = readLine();
		int N = Integer.parseInt(strings[0]);
		long[] A = new long[N];
		strings = readLine();
		for(int i=0;i<N;i++) {
			A[i]= Long.parseLong(strings[i]);
		}
		long now = 0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				now = (now+XOR(A[i],A[j]))%DIVISOR;
			}
		}
		print(now);
		
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC

	private static long XOR(long a, long b) {
		long ret = 0;
		for(long i=1;i<=a||i<=b;i*=2) {
			if((a&i)==0) {
				ret+=(((b&i)==0)?0:i);
			}else {
				ret+=(((b&i)==0)?i:0);
			}
		}
		return ret;
	}
	
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
}
