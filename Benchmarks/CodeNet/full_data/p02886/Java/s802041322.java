import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			int n = scan.nextInt();
			
			int[] d = new int[n];
			for(int i=0; i<n; i++) {
				d[i] = scan.nextInt();
			}
			
			long ans= 0;
			
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					ans += d[i]*d[j];
				}
			}
			
			System.out.println(ans);
		}
	}
}