import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int k = sc.nextInt();
		long nn = n / k;
		long c = nn * nn * nn;
		if(k % 2 == 0) {
			long ne = n / (k / 2) - nn;
			c += ne * ne * ne;
		}
		System.out.println(c);
	}

}