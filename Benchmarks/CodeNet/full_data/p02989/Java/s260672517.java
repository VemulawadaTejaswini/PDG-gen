import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] d = new int[n];
		int ans = 0;

		for(int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		for(int k = 1; k <= Math.pow(10, 5); k++) {
			int abc = 0;
			int arc = 0;
			for(int j = 0; j <n; j++) {
				if(d[j] >= k) {
					arc++;
				}
				else {
					abc++;
				}
			}
			if(abc == arc) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
