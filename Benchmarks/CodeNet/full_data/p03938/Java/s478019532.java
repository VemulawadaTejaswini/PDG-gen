import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i=0; i<n; i++){
			p[i] = sc.nextInt();
		}
		sc.close();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0; i<n; i++){
			a[i] = 20000 * i + p[i] + 1;
			b[i] = 20000 * (n-i) + 1;
		}
		
		StringBuilder sba = new StringBuilder();
		StringBuilder sbb = new StringBuilder();
		
		for(int i=0; i<n; i++){
			sba.append(a[i] + " ");
			sbb.append(b[i] + " ");
		}
		System.out.println(sba.toString());
		System.out.println(sbb.toString());

	}

}