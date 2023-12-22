import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		String C = scan.next();
		String Alast = A.substring(A.length());
		String Bfirst= B.substring(0);
		String Blast = B.substring(B.length());
		String Cfirst = C.substring(0);
		if(Alast.equals(Bfirst)&&Blast.equalsIgnoreCase(Cfirst)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
