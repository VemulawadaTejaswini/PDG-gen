import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long sum = 0;
		sum += (a + b)/x;
		if(a%x==0)sum++;
		System.out.println(sum);
	}
}