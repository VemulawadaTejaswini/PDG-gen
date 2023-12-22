import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), min=Long.MAX_VALUE;
		long city[] = new long[5];
		for(int i=0; i<5; i++) {
			city[i]=sc.nextLong();
			min=Math.min(min, city[i]);
		}
		System.out.println((long)Math.ceil((double)n/min)-1+5);
	}
}