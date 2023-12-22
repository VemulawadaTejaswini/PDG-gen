import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int ans = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		while(true) {
			boolean flag = false;
			for(int i = 0; i < n; i++) {
				if(a[i]%2 == 1) {
					flag = true;
				}
			}
			if(flag) {
				break;
			}
			ans++;
			for(int j = 0; j < n; j++) {
				a[j] = a[j]/2;
			}
		}
		System.out.println(ans);
	}
}