import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int sqrt = (int) Math.sqrt(N);
		long min = 0;
		for (long i = 1; i <= sqrt; i++) {
			if (N%i == 0) {
				min = (i+N/i-2);
			}
		}
		System.out.println(min);
	}
}