import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 入力値
		int n = sc.nextInt();
		sc.close();

		int[][] p = new int[10][10];
		for(int i=1;i<=n;i++){
			int a = Integer.parseInt(String.valueOf(i).substring(0, 1));
			int b = i % 10;
			p[a][b]++;
		}
		long ans = 0;
		for(int i=1;i<=n;i++){
			int a = Integer.parseInt(String.valueOf(i).substring(0, 1));
			int b = i % 10;
			ans += p[b][a];
		}
		System.out.println(ans);
	}
}