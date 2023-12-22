
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] w = new String[n];
        for (int i = 0 ; i < n ; i++) {
            w[i] = sc.next();
        }
        boolean s = true;
        for (int i = 0 ; i < n - 1; i++) {
            String a = w[i].substring(w[i].length() - 1, w[i].length());
            String b = w[i + 1].substring(0, 1);
            if (!a.equals(b)) {
                s = false;
            }
         }

        Set<String> set = new HashSet<>();
        for (int i = 0 ; i < n ; i++ ) {
            set.add(w[i]);
        }
        if (set.size() != n ) {
            s = false;
        }

        if (s) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}