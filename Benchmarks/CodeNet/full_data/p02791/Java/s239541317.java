import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = scan.nextInt();
		}


		int cnt = 1;
		int min = p[0];
		for(int i = 1; i < n; i++) {
			if(p[i] <= min) {
				cnt++;
				min = p[i];
			}
		}

		System.out.println(cnt);
	}
}