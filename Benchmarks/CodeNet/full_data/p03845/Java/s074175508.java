import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int i, sum = 0, ans = 0;
		int n = sc.nextInt();
		int[] t = new int[n];
		for(i = 0; i < n; i++){
			t[i] = sc.nextInt();
			sum += t[i];
		}
		int m = sc.nextInt();
		for(i = 0; i < m; i++){
			ans = sum - t[sc.nextInt()] + sc.nextInt();
			System.out.println(ans);
		}
	}
}