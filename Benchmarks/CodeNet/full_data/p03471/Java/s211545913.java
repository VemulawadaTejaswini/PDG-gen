import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double y = sc.nextDouble();

		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n-i; j++) {
				int k=n-(i+j);
					if(10000*i+5000*j+1000*k==y && i+j+k==n) {
						System.out.println(i +" "+ j+" "+ k);
						return;
					}
			}
		}
		System.out.println("-1 -1 -1");
	}
}