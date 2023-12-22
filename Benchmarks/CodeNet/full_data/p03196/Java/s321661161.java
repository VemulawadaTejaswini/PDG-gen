
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		long n = sc.nextLong();
		long p = sc.nextLong();
		
		
		if(n == 1){
			System.out.println(p);
			return ;
		}
		
		int max = 1;
		for(int res = 2;;res++){
			long po = pow(res,n,p);
			if(po > p){
				break;
			}
			
			if(p % po ==0){
				max = Math.max(res, max);
			}
		}
		
		System.out.println(max);
	}
	
	
	long pow(int e, long r, long n){
		long res = 1;
		for(long i =0 ; i < r; i++){
			if(res > n/e + 1){
				return  n+1;
			}
			res *= e;
		}
		return res;
	}
}
