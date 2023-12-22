import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        String C = scan.next();
        
        if(A.equals("5") && B.equals("5")) {
        	System.out.println("YES");
        }else if(B.equals("5") && C.equals("5")){
        	System.out.println("YES");
        }else if(A.equals("5") && C.equals("5")){
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
	}
}