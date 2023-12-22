import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		partA();
		
	}
	
	public static void partA() {
		Scanner scA = new Scanner(System.in);
		int N = scA.nextInt();
		
		if (N <= 999) {
			System.out.println("ABC");
		}else if(N <= 1998) {
			System.out.println("ABD");
		}
	}
}