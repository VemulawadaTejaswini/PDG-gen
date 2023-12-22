import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int result = 0;
		for(int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			result += t[i];
		}
		int m= sc.nextInt();
		for(int i = 0; i < m; i++) {
			int index = sc.nextInt()-1;
			int effect = sc.nextInt()-t[index];
			int ans = result+effect;
			System.out.println(ans);
		}
	}
}
