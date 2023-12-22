import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] hps = new int[n];
		for(int i=0; i<n; i++) {
			hps[i] = sc.nextInt();
		}
		sc.close();
		
		int ans = hit(hps[0], hps[1]);
		for(int i=2; i<n; i++) {
			ans = hit(ans, hps[i]);
			if(ans == 1 )
				break;
		}
		
		System.out.println(ans);
	}
	
	static int hit(int a, int b) {
		if(a == b)
			return a;
		
		if( Math.min(a, b) == 0)
			return Math.max(a, b);
		
		return(hit( Math.max(a, b) % Math.min(a, b), Math.min(a, b) ) );
	}
}