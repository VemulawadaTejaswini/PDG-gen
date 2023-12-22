import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "Yes";
        String[] w = new String[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.next();
            for (int j = 0; j < i; j++) {
                if (w[j].equals(w[i])) ans = "No";
            }
        }
        for (int i = 1; i < n; i++) {
            if (w[i-1].charAt(w[i-1].length()-1) != w[i].charAt(0)) ans = "No";
        }
        System.out.println(ans);
    }

}