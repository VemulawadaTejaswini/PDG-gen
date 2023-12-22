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
		int[] a = new int[n + 1];
		Arrays.fill(right, 0);
		for(int i = 1; i <= n; i++) a[i] = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				num = (num + a[j]) % m;
				//System.out.println(num);
				if(num == 0) {
					right[j] = right[i - 1] + 1;
					break;
				}
			}
			num = 0;
		}
		long sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += right[i];
		}
		System.out.println(sum);
		//System.out.println(Arrays.toString(right));
	}
	public static void main(String[] args) {
		new Main();
	}
}