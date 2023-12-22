import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		String C = scan.next();

		char[] X = A.toCharArray();
		char[] Y = B.toCharArray();
		char[] Z = C.toCharArray();
		
		if(X[X.length-1]==Y[0]) {
			if(Y[Y.length-1]==Z[0]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}else {
			System.out.println("NO");
		}
		
	}

}
