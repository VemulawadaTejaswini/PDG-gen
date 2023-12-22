import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		String T = stdIn.next();
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		String U = stdIn.next();
		int ans = 0;
		if(S.equals(U)){
			ans = A - 1;
			System.out.println(ans + " " + B);
		}
		else{
			ans = B - 1;
			System.out.println(A + " " + ans);
		}
		stdIn.close();
	}
}