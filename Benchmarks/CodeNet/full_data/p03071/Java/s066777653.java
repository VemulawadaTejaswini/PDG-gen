import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int calculateA = calculation(A);
		int calculateB = calculation(B); 
		
		if(calculateA < calculateB) {
			System.out.println(calculateB);
		}else {
			System.out.println(calculateA);
		}
		sc.close();
	}
	
	private static int calculation(int input) {
		return input + (input-1);
	}
}
