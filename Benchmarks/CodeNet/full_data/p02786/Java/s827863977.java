import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		execute5_1();
	}
	
	private static void execute5_1() {
		try (Scanner sc = new Scanner(System.in)) {
			long H = sc.nextLong();
			
			long pw=0;
			long ans = 1;
			while(H>1) {
				pw++;
				ans += (long) (Math.pow(2, pw));
				H=H/2;
			}
		
		
		System.out.println(ans);
		}
		
	}
}