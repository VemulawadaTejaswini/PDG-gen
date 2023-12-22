import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			long []T = new long[N];
			for(int i = 0;i<N;i++)T[i] = scan.nextLong();
			long g = T[0];
			long l = T[0];
			for(int i = 1;i<N;i++) {
				g = lcm(g,T[i]);
				
			}
			
			System.out.println(g);

			
		}
		
		
	}
	
	
	private static long gcd(long A,long B){//最大公約数
		return B==0?A:gcd (B,A%B);
	}
	
	private  static long lcm(long A,long B) {//最小公倍数
		return A/gcd(A,B)*B;
	}
		

}
