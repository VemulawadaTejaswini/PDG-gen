import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	Main(){
		doIt();
	}
	void doIt() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] right = new int[n + 1];
		int num = 0;
		long sum = 0;
		int[] a = new int[n + 1];
		Arrays.fill(right, 0);
		a[0] = 0;
		for(int i = 1; i <= n; i++) a[i] = (a[i - 1] +sc.nextInt()) % m;
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				if(a[j] - a[i - 1] == 0) {
					right[j] = right[i - 1] + 1;
					sum += right[j];
					break;
				}
			}
		}
		System.out.println(sum);
		//System.out.println(Arrays.toString(right));
	}
	public static void main(String[] args) {
		new Main();
	}
}