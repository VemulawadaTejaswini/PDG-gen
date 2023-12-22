
import java.util.Scanner;

public class Main {
	
	//ABC 115 d 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		long x = Long.parseLong(sc.next());
		

		long ans = rec(n,x);
		System.out.println(ans);

	}
	
	static long rec(int n , long x) {
		
		if(n == 0) {
			return 1;
		}
	
		long ren = (1L << n+1) - 3;		//レベルn-1の層の枚数
		long num = (1L << n) - 1 ;	 	//レベルn-1にあるPの数
		
		if(x == 1) {
			return 0;
		}
		
		if(x <= ren +1) {
			return rec(n-1,x-1); 
		}
		else if (x == ren +2) {
			return num + 1;
		}
		else if (x < 2 * ren + 3) {
			return num + 1 + rec(n-1,x-ren-2);
		}
		else {
			return 2 * num +1;
		}
	}
	
	// B|(n-1Level)|P|(n-1Level)|B
	//  	①		②		③

}
