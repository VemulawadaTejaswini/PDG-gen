import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] P = new int[N];
		for(int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}
		sc.close();
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for(int i = 0; i < N; i++) {
			if(P[i] <= A) {
				c1++;
			}else if(P[i] <= B) {
				c2++;
			}else {
				c3++;
			}
		}
		int min = Math.min(c1, Math.min(c2, c3));
		System.out.println(min);
	}
}