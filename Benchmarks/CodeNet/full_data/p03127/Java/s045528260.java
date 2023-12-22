import java.math.BigInteger;
import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			
			long res = data[0];
			for(int i = 1; i < n; i++){
				res = gcd(res, data[i]);
			}
			System.out.println(res);
		}
	}
	
	private long gcd(long a, long b){
		if(b == 0)  return a;
		else        return gcd(b, a%b);
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
