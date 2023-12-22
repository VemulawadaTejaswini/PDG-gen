import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n < 1000){
				System.out.println("ABC");
			}
			else{
				System.out.println("ABD");
			}
		}
	}
	
	private long calc(long n, long m, long l){
		long sum = 1;
		for(long i = n; i > m; i--){
			sum *= i;
		}
		for(long i = 2; i <= l; i++){
			sum /= i;
		}
		return sum;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
