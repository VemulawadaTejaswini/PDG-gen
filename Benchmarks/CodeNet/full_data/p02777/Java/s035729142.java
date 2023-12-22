import java.util.*;

/**
 * @author yamato
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		String T = scanner.next();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		String U = scanner.next();
		
		if(S.equals(U)) {
			A = A-1;
		}else if(T.equals(U)){
			B = B-1;
		}
		System.out.print(A+" "+B);
		
	}

}