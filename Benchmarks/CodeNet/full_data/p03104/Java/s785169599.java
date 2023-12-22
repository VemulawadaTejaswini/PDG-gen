import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		if (A == B) {
			System.out.println(A);
			return;
		}
		
		if (A % 2 == B % 2) {
			//偶数と偶数　or 偶数と偶数
			long sub = ((B - (A-1L)) / 2L) % 2L;
			System.out.println((A^B) - sub);
		} else {
			//偶数と奇数 or 元が奇数で出先が偶数
			System.out.println(A^B);
		}
	}
}
