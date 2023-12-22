import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int i , j , n , m;
		n = scan.nextInt();
		m = scan.nextInt();
		long value = 1;
		for (i = 0;i < m;i ++) {
			value *= 2;
		}
		value *= ((long) (n - m) * 100 + (long) m * 1900);
		System.out.println(value);
		
	}
		
}








