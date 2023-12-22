import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		int x = B - A + 1;
		int[] y = new int[x];
		for(int i = 0; i < x; i++) {
			y[i] = A + i;
		}
		
		if(x <= K * 2) {
			for(int i = 0; i < x; i++) {
				System.out.println(y[i]);
			}
		} else {
			for(int i = 0; i < K; i++) {
				System.out.println(y[i]);
			}
			for(int i = K; i > 0; i--) {
				System.out.println(y[x - i]);
			}
		}
		
		sc.close();

	}

}
