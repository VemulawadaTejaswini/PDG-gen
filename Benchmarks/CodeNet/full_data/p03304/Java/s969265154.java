import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long d = sc.nextLong();
		long k =0;

		if(d == 0) {
			k = 1;
		}else {
			k = 2;
		}

		double ans = (double)(k * (n-d) * (m-1)) / (n*n);


		System.out.println(ans);
	}
}