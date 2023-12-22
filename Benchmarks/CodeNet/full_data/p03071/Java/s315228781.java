import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(getMaximum(A, B));
	}
	
	private static int getMaximum(int a, int b) {
		return a == b? a * 2 : 2 * Math.max(a, b) - 1;
	}
}