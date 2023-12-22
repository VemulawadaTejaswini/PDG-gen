import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n + 1];
		a[0] = 0;
		int max = 0;
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			if (max <= a[i]) {

				max = a[i];
			}
		}

if(max<sum(a)-max){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
	}

	static int sum(int a[]) {
		int n = a.length;
		int ans = 0;
		for (int i = 1; i <= n - 1; i++) {
			ans += a[i];
		}
		return ans;
	}
}