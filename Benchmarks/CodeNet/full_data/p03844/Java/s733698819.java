import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String op = s.next();
		int b = s.nextInt();
		int answer = 0;
		

		if(op.equals("+")) {
			answer = a + b;
		}else if(op.equals("-")) {
			answer = a - b;
		}

		System.out.println(answer);

	}

}