import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int n1 = a-b;
		int n2 = a+b;
		int n3 = a*b;
		
		int m = Math.max(n1, n2);
		m = Math.max(m, n3);
		
		System.out.println(m);
	}

}
