import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long []a = new long [5];
		
		for(int i = 0; i < 5; i++) {
			a[i] = sc.nextLong();
			
		}
		Arrays.sort(a);
		
		long ans = (long)(Math.ceil((double)n/a[0]) + 4);
		
		System.out.println(ans);
		
		
	}
}