import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long sum = 0;
		sum = (b/x) + (a/x);
		if(a==0)sum--;
		System.out.println(sum);
	}
}