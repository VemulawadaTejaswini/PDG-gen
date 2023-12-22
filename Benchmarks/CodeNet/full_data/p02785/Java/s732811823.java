import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static BufferedReader reader;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] HN = readLine();
		int N = Integer.parseInt(HN[0]);
		int K = Integer.parseInt(HN[1]);
		String[] as = readLine();
		int[] a = new int[N];
		for(int i=0;i<N;i++) {
			a[i]=Integer.parseInt(as[i]);
		}
		Arrays.sort(a);
		long cnt = 0;
		for(int i=0;i<N-K;i++) {
			cnt+=a[i];
		}
		print(cnt);
		
		
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
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