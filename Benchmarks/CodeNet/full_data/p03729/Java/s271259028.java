import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        char A_last = A.charAt(A.length()-1);
        char B_first = B.charAt(0);
        char B_last = B.charAt(B.length()-1);
        char C_first = C.charAt(0);
        if(A_last == B_first && B_last == C_first){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
	}
}