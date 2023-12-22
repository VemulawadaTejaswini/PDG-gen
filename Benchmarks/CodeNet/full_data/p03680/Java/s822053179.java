import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int k = 0;
		int i = 0;
		while(k <= n && i != 1) {
			i = a[i]-1;
			k++;
		}
		if(k > n) {
			System.out.println(-1);
		} else {
			System.out.println(k);
		}
		
	}

}
