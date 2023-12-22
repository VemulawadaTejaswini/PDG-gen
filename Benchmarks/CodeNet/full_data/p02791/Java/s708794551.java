import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[] p = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			boolean flag = true;
			for(int j = 0; j <=i; j++) {
				if(p[j] < p[i]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
			}
		}
		System.out.println(count);
	}
}
