import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		for(int i=0;i<n;i++) {
			p[i] = sc.nextInt();
		}
		int max = 0;
		int tmp = 0;
		for(int i=0;i<n-k+1;i++) {
			tmp = 0;
			for(int j=0;j<k;j++) {
				tmp += p[i+j];
			}
			max = Math.max(tmp, max);
		}
		System.out.println((double)(max+k)/2);
	}

}
