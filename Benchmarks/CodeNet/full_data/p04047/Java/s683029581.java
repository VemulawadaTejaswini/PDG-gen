import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] l= new int[2*n];
		for(int i=0;i<2*n;i++) l[i] = sc.nextInt();
		Arrays.sort(l);
		int ans=0;
		for(int i=0;i<n;i++) {
			ans+=l[2*i];
		}
		System.out.println(ans);
	}
}
