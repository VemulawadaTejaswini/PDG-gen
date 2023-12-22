import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		
		int A, I;
		if (H < W) {
			A = W;
			I = H;
		}else {
			A = H;
			I = W;
		}
		
			
		for(int i = 1; i<=I;i++) {
			int B = i*A;
			if (B >= N) {
				System.out.print(i);
				break;
			}
		} 
		sc.close();
 
	}
}