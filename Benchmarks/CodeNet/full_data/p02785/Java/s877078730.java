import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int h[] = new int[n];
		for(int i=0; i<n; i++) {
			h[i]=sc.nextInt();
		}
		Arrays.sort(h);
		long c=0;
		for(int i=0; i<n-k; i++) {
			c+=h[i];
		}
		System.out.println(c);
		sc.close();
	}
}
