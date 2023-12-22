import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int K = scan.nextInt();
			long goukei=0;
			for(int i = 1;i<=K;i++) {
				for(int j = 1;j<=K;j++) {
					for(int z = 1;z<=K;z++) {
						
						goukei+=gcd(gcd(i,j),z);
						
						
						
					}
				}
			}
			
			
			System.out.println(goukei);
			
		}
		
		
	}
		
	
	private static int gcd(int A,int B){//最大公約数
		return B==0?A:gcd (B,A%B);
	}

}
