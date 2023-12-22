import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long min = n-1;

		for(long i =2; i * i <= n;i++) {
			for(long j =2; j <= n;j++) {
				if(i > j) {
					break;
				}
				if( i * j > n) {
					break;
				}else if(i * j == n) {
					if(i + j -2 < min) {
						min = i + j -2;
					}
				}
			}
		}
		System.out.println(min);

	}
}