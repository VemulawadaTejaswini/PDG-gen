import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		int times = 0;
		int small = A > B ? B:A;
		int big = A > B ? A : B;
//		int output = 1;
//		int i = 2;
		for(int i = 1; i <= small; i++) {
			if(big%i == 0 && small%i == 0) {
				times++;
//				System.out.println(i);
				if(times == K) {
					System.out.println(i);
					break;
				}
			}
		}
		
	}

}
