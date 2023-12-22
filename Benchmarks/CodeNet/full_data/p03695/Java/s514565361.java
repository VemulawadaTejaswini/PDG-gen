import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] color = new int[8];
		int over = 0;
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(a < 3200) color[a/400]++;
			else over++;
		}
		for(int i = 0; i < 8; i++) {
			if(color[i] > 0) ans++;
		}
		int ans2 = Math.min(8,ans+over);
		System.out.printf("%d %d", ans, ans2);
		sc.close();
	}
}