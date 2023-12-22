import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] a = new int[N];
		for(int i = 0;i < N;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int cnt = 0;
		int max = 1;
		for(int X = 1;X < N;X++) {
			for(int i = 0;i < a.length;i++) {
				if(X - 1 == a[i] || X == a[i] || X + 1 == a[i]) {
					cnt++;
				}
			}
			max = Math.max(max, cnt);
			cnt = 0;
		}
		System.out.println(max);
	}
}