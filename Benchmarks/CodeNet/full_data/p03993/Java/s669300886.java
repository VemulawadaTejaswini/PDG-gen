import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt() - 1;
		}
		sc.close();
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if(i == a[a[i]]) {
				cnt++;
			}
		}
		System.out.println(cnt / 2);
	}
}