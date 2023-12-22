import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, m;
		n = scan.nextInt();
		m = scan.nextInt();
		boolean canMake = true;
		int[] xxx = new int[3];
		for(int i = 0; i < 3; i++) {
			xxx[i] = -1;
		}
		for(int i = 0; i < m; i++) {
			int s = scan.nextInt() - 1;
			int c = scan.nextInt();

			if(xxx[s] == -1) {
				xxx[s] = c;
			} else {
				if(xxx[s] != c) canMake = false;
			}
		}
		if(xxx[0] == 0 && n > 1) canMake = false;
		if(xxx[0] == -1 && n > 1) xxx[0] = 1;
		if(canMake) {
			for(int i = 0; i < n; i++) {
				if(xxx[i] == -1) xxx[i] = 0;
				System.out.print(xxx[i]);
			}
		} else {
			System.out.print(-1);
		}
		System.out.println();
		scan.close();

	}

}
