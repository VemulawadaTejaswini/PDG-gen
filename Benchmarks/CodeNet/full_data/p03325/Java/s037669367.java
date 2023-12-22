import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int ans = 0;

		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			b[i] = 0;
			while(a[i]%2 == 0) {
				a[i] = a[i]/2;
				b[i] ++;
			}
			ans += b[i];
		}
		System.out.println(ans);

	}

}
