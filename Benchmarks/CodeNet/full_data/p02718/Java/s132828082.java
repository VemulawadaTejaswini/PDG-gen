import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int m = stdIn.nextInt();

		int[] a = new int[n];
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
			cnt += a[i];
		}

		boolean flag = true;
		Arrays.sort(a);
		for(int i = a.length-1; i>a.length-1-m; i--) {
			if(a[i]< cnt/(4.0*m)) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

}
