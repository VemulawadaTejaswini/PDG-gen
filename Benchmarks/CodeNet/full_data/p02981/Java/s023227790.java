import java.util.Scanner;

class _133 {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if(N >=1 && N<=20 && A>=1 && A<=50 && B >=1 && B<=50) {
			if(N*A <= B) {
				System.out.println(N*A);
			}else {
	
				System.out.println(B);
			}
		}
	}
}
