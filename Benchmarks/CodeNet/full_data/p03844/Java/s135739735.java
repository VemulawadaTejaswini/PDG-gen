import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String op = sc.next();
	int b = sc.nextInt();
	
		if(op.equals("+")) {
			System.out.println(a + b);
		} else if(op.equals("-")) {
			if(a > b) {
				System.out.println(a - b);
			} else {
				System.out.println(b - a);
			}
		} else {
			throw new Exception("Error");
		}
	}
}