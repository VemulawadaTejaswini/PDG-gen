import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int l[]=new int[n];
		for(int i=0;i<n;i++) {
			l[i]=scan.nextInt();
		}
		scan.close();
		Arrays.sort(l);
		int ans=0;
		for(int i=n-k;i<n;i++) {
			ans+=l[i];
		}

		System.out.println(ans);
	}
}
