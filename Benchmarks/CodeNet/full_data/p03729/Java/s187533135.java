import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        String C = scan.next();
        
        if(A.charAt(A.length() - 1) == B.charAt(0)) {
            if(B.charAt(B.length() - 1) == C.charAt(0)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
