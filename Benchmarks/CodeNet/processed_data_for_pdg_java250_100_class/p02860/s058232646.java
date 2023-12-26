 import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		String S = scanner.next();
		String T ="";
		String F ="";
		T =S.substring(0, S.length()/2);
		F =S.substring(S.length()/2,N);
		if( T.equals(F)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
