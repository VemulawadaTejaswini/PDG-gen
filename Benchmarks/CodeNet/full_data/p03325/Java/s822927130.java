import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] strA = sc.nextLine().split(" ");
		int[] a = new int[N];
		for(int i=0; i<N; i++) { a[i] = Integer.parseInt(strA[i]);}
		int ans = half(a, 0, N);
		System.out.println(ans);
		sc.close();
	}

	private static int half(int[] a, int count, int N) {
		for(int i=0; i<N; i++) {
			if(a[i] % 2 == 0) {
				a[i] /= 2;
				count++;
				count = half(a, count, N);
			}
		}
		return count;
	}
}