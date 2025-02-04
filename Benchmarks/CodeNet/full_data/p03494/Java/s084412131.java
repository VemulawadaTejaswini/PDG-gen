import java.util.*;

public class ABC089A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ansMax = 999;
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int cnt = 0;
			while (A % 2 == 0) {
				cnt++;
				A /= 2;
			}
			ansMax = Math.min(ansMax, cnt);
		}
		System.out.println(ansMax);
	}
}