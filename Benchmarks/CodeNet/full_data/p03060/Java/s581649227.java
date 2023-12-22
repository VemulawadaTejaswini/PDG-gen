import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] v = new int[n];
		int[] c = new int[n];

		int i;
		for(i = 0; i < n; i++) {
			v[i] = scan.nextInt();
		}

		for(i = 0; i < n; i++) {
			c[i] = scan.nextInt();
		}

		int ans = 0;

		for(i = 0; i < n; i++) {
			if(v[i] > c[i])
				ans += v[i] - c[i];
		}

		System.out.println(ans);
	}
}
