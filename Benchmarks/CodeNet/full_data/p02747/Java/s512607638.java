import java.util.*;
 
public class Main {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        boolean ok = true;

        if (S.length() == 1 || S.length() % 2 != 0) {
            System.out.println("No");
            return;
        }

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (i % 2 == 0) {
                if (c != 'h') ok = false;
            } else {
                if (c != 'i') ok = false;
            }
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

} 