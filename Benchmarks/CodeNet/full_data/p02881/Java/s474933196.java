import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		long a = 0;
		long b = 0;
		long dis = Long.MAX_VALUE;
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				long num1 = i;
				long num2 = n/i;
				if(dis>Math.abs(num1-num2)) {
					dis = Math.abs(num1-num2);
					a = num1;
					b = num2;
				}
			}
		}
		System.out.println((a-1)+(b-1));
	}
}