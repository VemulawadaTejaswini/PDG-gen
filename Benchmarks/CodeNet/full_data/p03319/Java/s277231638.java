import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			for(int i = 1;i < n; i++){
				if((k - 1) * i + 1 >= n){
					System.out.println(i);
					break;
				}
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
