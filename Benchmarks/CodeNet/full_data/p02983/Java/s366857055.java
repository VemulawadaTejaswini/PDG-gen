
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long l = sc.nextLong();
		long r = sc.nextLong();
		
		int min = 2019;
		for (long i = l; i <= r; i++) {
			for (long j = i+1; j <= r; j++) {
				long mod = (i * j) % 2019;
				if(min > mod) {
					min = (int)mod;
					if(min==0)break;
				}
				if(min==0)break;
			}
		}
		System.out.println(min);
	}
}
