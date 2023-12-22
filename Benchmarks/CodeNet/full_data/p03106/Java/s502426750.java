import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		int times = 0;
		int small = A > B ? B:A;
		int big = A > B ? A : B;
		int output = 1;
		for(int i = 1; i <= small; i++) {
			if(big%i == 0 && small%i == 0) {
				times++;
				output = i;
				if(times == K) {					
					break;
				}
			}
		}
		System.out.println(output);
		
	}

}
