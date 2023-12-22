import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		int N = S.length();
		String S3 = S.substring(0,(N - 1) / 4);
		String S4 = S.substring((N + 2) / 4, (N - 1) / 2);
		String S5 = S.substring((N + 2) / 2, ((N - 1) * 3 / 4) + 1);
		String S6 = S.substring((N + 1) * 3 / 4, N);
		if(N == 3){
			if(S3.equals(S4)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
		else{
			if(S3.equals(S4) && S5.equals(S6)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}

		stdIn.close();
	}
}
