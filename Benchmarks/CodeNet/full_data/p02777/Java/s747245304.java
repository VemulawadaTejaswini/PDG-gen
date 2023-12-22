import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		String T=scan.next();
		int A=scan.nextInt();
		int B=scan.nextInt();
		String U=scan.next();
		if(S.equalsIgnoreCase(U))
		{
			A--;
		}
		else {
			B--;
	
		}
		System.out.println(A);
		System.out.println(B);
	}

}