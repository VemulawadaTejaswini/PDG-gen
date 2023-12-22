import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		int a = A;
		int b = B;
		
		for(int i = 1; i <= K; i++) {
			if(i % 2 != 0) {
				if(a % 2 == 0) {
					a = a / 2;
					b = b + a;
					
				} else {
					a = a - 1;
					a = a / 2;
					b = b + a;
				}
			} else {
				if(b % 2 == 0) {
					b = b / 2;
					a = a + b;
					
				} else {
					b = b - 1;
					b = b / 2;
					a = a + b;
				}			
			}
		}
		
		System.out.println(a + " " + b);
		
	}
}
