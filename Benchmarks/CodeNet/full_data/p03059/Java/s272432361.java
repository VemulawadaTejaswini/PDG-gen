import java.util.Scanner;

public  class Main  {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int  A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=T; i++) {
			if(i%A==0) {
				sum += B;
			}
			
			
		}
		System.out.println(sum);
		
	}
	

}
