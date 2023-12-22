import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();int a=0;
		int[] b = new int[n-1];
		for(int i=0;i<n-1;i++) 	b[i] = sc.nextInt();
		for(int i=0;i<n-1;i++) {
			int m=100000;
			for(int j=i;j<n-1;j++) {
				m=Math.min(m, b[j]);
			}
			a+=m;
		}
		int m=100000;
		for(int i=0;i<n-1;i++) {
			m=Math.min(m, b[i]);
		}
		a+=m;
		System.out.println(a);

	}
}