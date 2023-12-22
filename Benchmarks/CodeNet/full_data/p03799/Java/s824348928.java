import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		if (2*n>=m) {
			System.out.print(2*n);
		}
		else {
			long a = m-2*n;
			long b = n + a/4;
			System.out.print(b);
		}
	}

}
