import java.util.*;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long count=0;
		long A=a/x;
		if(a%x==0) A=A-1;
		long B =b/x;
		count=B-A;
		System.out.println(count);

	}

}