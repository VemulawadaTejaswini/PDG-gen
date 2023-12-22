import java.util.*;

public class Main {

	private long gcd(long a, long b){
		if(b == 0)  return a;
		else        return gcd(b, a%b);
	}
	
	private long lcm(long a, long b){
		return a / gcd(a, b) * b;
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			long [] data = new long[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextLong();
			}
			
			long res = 1;
			for(int i= 0; i < n; i++){
				res = lcm(res, data[i]);
			}
			System.out.println(res);
		}

	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
