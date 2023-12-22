import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];
		for(int i = 0; i < 9; i++) {
				a[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < n; j++) {
				if(a[i] == b[j]) {
					a[i] = 0;
				}
			}
		}
		boolean bool = false;
		if(a[0] == a[1] && a[1] == a[2] && a[2] == 0) {
			bool = true;
		}
		if(a[3] == a[4] && a[4] == a[5] && a[5] == 0) {
			bool = true;
		}
		if(a[6] == a[7] && a[7] == a[8] && a[5] == 0) {
			bool = true;
		}
		if(a[0] == a[3] && a[3] == a[6] && a[6] == 0) {
			bool = true;
		}
		if(a[1] == a[4] && a[4] == a[7] && a[7] == 0) {
			bool = true;
		}
		if(a[2] == a[5] && a[5] == a[8] && a[8] == 0) {
			bool = true;
		}
		if(a[0] == a[4] && a[4] == a[8] && a[8] == 0) {
			bool = true;
		}
		if(a[2] == a[4] && a[4] == a[6] && a[6] == 0) {
			bool = true;
		}
			if(bool) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		sc.close();
	}
}