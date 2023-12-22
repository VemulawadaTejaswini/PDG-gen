import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int calculateA = calculation(A);
		int calculateB = calculation(B); 
		int calculateAB = A+B;
		
		int maxAorB = Math.max(calculateA, calculateB);

		if(maxAorB < calculateAB) {
			System.out.println(calculateAB);
		}else {
			System.out.println(maxAorB);
		}
	}
	
	private static int calculation(int input) {
		return input + (input-1);
	}
}
