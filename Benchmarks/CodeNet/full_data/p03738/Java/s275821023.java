import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		if(A == B) System.out.println("EQUAL");
		else if(A > B) System.out.println("GREATER");
		else if(A < B) System.out.println("LESS");
	}

}