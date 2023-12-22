import java.util.Scanner;

public class Main {
	private static int[] a = new int[4];
	private static String[] op = new String[3];

	public static boolean dfs(int i, int sum) {
		if(i==4) {
			return sum == 7;
		}
		if(dfs(i+1, sum + a[i])) {
			op[i-1] = "+";
			return true;
		}
		if(dfs(i+1, sum-a[i])) {
			op[i-1] = "-";
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for(int i=3; i>=0; i--) {
			a[i] = n%10;
			n/=10;
		}
		if(dfs(1,a[0])) {
			System.out.print(a[0]);
			for(int i=1; i<4; i++) {
				System.out.print(op[i-1]);
				System.out.print(a[i]);
			}
			System.out.println("=7");
		}else {
			System.out.println("-1");
		}

	}
}
