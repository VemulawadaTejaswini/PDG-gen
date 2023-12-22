import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		int ans = 1;
		int o = a[0];
		for (int i = 0; i < n; i++) {
			if(i+1 < n) {
				if (o*2>=a[i+1]){
					ans++;
					o+=a[i+1];
				}else{
					ans = 1;
					o+=a[i+1];
				}
			}
		}
		System.out.println(ans);
	}
}