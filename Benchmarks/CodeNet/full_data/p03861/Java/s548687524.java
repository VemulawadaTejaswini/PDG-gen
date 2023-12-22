import java.util.*;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long count=0;
		for(long i=a;i<b;i++) {
			if(i%x==0)count++;
		}
		System.out.println(count);

	}

}