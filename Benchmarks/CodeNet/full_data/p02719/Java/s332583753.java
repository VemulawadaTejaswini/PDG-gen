import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long n=sc.nextLong();
		long k=sc.nextLong();
		if(n<k) {
			System.out.println((long)Math.min(n, k-n));
		}else if(n%k==0)System.out.println(0);
		else {
			System.out.println(k-(n%k));
		}
		
		sc.close();
	}
}
