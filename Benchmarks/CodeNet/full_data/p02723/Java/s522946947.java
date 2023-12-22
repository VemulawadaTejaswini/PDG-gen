import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		char S3 = S.charAt(2);
		char S4 = S.charAt(3);
		char S5 = S.charAt(4);
		char S6 = S.charAt(5);
		if(S3 == S4 && S5 == S6){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		stdIn.close();
	}
}