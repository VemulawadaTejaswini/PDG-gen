import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long total = 0;
		long atot = 0;
		for(long i = 1; i < Math.pow(10,100); i++) {
			if(i % 2 == 1) {
				atot += a;
				total += a;
				if(total > n) {
					atot = atot - (total - n);
					break;
				}
			}else {
				total += b;
				if(total > n) {
					break;
				}
			}
		}
		System.out.println(atot);
	}

}