import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        if (N%2 == 1) {
            System.out.println("No");
            return;
        }
        boolean ans = true;
        for (int i = 0; i < N/2; i++) {
            if (S.charAt(i) != S.charAt(N/2+i)) {
                ans = false;
                break;
            }
        }
        System.out.println(ans ? "Yes" : "No");
    }
}
