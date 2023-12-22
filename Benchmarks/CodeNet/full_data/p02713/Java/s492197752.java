import java.util.Scanner;
public class Main {
	//最大公約数gcd
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int k = stdIn.nextInt();
		long cnt = 0;
		for(int i = 1; i <=k; i++) {
			for(int j =1; j <= k; j++) {
				for(int m = 1; m <= k; m++) {
					cnt += gcd(gcd(i,j),m);
				}
			}
		}
		
		System.out.println(cnt);
	}

}
