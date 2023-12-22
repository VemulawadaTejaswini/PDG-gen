import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		
		if(sc.nextInt() != 0) {
			System.out.println(0);
			return;
		}
		
		for(int i=1;i<n;i++) {
			p[sc.nextInt()] ++;
		}
		
		long ans = 1;
		if(p[0]>0) {
			System.out.println(0);
			return ;
		}
		
		for(int i=2;i<n;i++) {
			ans *= Math.pow(p[i-1], p[i]);
		}
		
		System.out.println(ans%998244353);
	}

}
