import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		p[0] = sc.nextInt();
		for(int i=1;i<n;i++) {
			p[i] = p[i-1] + sc.nextInt();
		}
		int max = p[k-1];
		for(int i=1;i<n-k+1;i++) {
			max = Math.max(max, p[i+k-1]-p[i-1]);
		}
		System.out.println((double)(max+k)/2);
	}
	

}
