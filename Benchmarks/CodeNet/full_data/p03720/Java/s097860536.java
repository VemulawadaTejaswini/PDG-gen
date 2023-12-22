import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] a = new int[M];
		int[] b = new int[M];
		for(int i = 0;i < M;i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int[] cnt = new int[N];
		for(int i =0;i < N;i++){
			for(int j = 0;j < M;j++) {
				if(a[j] == i+1) {
					cnt[i]++;
				}
				if(b[j] == i+1) {
					cnt[i]++;
				}
			}
		}
		for(int i : cnt) {
			System.out.println(i);
		}
	}
}