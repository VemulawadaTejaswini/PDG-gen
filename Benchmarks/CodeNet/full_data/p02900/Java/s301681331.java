import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = gcd(a, b);

        int count = 1;

		long d = gcd;
		for (int i = 2; i <= Math.sqrt(gcd); i++) {
			if (d % i == 0) {
				count++;
				while (d % i == 0) {
					d = d / i;
				}
			}
		}

		if (d != 1)
			count++;
		System.out.println(count);
    }

    static long gcd (long a, long b) {
    	long temp;
    	while((temp = a%b)!=0) {
    		a = b;
    		b = temp;
    	}
    	return b;
    }

}
