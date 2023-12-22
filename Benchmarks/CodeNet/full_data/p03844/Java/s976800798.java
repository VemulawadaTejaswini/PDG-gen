import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		String op = scan.next();
		int B = scan.nextInt();
		if(op == "+"){
			System.out.println(A + B);
		}
		else if(op == "-"){
			System.out.println(A - B);
		}
		

	}

}
