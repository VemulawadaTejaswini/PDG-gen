import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(a);

		for(int j =0 ;j<n-1;j++) {
			if(a[j] == a[j+1]) {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");

	}

}