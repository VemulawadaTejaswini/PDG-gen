import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.close();
		if(H == 1 || W == 1) {
			System.out.println(1);
			return;
		}
		long h = (H + 1) / 2;
		long w = (W + 1) / 2;
		long h2 = W / 2; 
		long w2 = H / 2;
		System.out.println((long)(h * w) + (long)(h2 * w2));
	}
}
