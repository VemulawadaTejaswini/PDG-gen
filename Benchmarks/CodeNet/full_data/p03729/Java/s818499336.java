import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		String C = scan.next();
		  if(A.charAt(A.length()-1) == B.charAt(0) && B.charAt(B.length()-1) == C.charAt(0)){
		      System.out.println("YES");
		    }else{
		      System.out.println("NO");
		    }
	}

}
