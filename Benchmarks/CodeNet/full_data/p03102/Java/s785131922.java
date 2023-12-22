import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
	
		int[] bList = new int[m];
		for (int i=0; i<m; i++) {
			bList[i] = sc.nextInt();
		}
		
		int ans = 0;
		for (int j=0; j<n; j++) {
			int count = 0;
			for (int k=0; k<m; k++) {
				count += sc.nextInt() * bList[k];
			}
			if (count+c > 0) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
