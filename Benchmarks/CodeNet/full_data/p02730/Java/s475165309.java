import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        String A = S.substring(0, N/2);
        String B = S.substring(((N+3)/2)-1, N);
        if(A.equals(B)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
