import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long sum =0;
		int K = sc.nextInt();
		Main main = new Main();
		for (int i=1;i<=K;i++) {
			for (int j=1;j<=K;j++) {
				for (int k=1;k<=K;k++) {
					int gcd= main.gcd(i, j);
					gcd =main.gcd(gcd, k);
					sum +=gcd;
				}
			}
		}
		System.out.println(sum);
  	}

	public int gcd(int a,int b) {
		if (b==0) {
			return a;
		} else {
			return gcd(b,a%b);
		}

	}
}