import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int Ans = 0;
		int Max = Math.max(A, B);
		Max = Math.max(Max, C);
		double pow = Math.pow(2, K);
		if (Max == A) {
			Ans = (A * (int)pow) + B + C;
		} else if (Max == B) {
			Ans = (B * ((int)pow)) + A + C;
		} else {
			Ans = (C * ((int)pow)) + A + B;
		}
		System.out.println(Ans);
	}
}