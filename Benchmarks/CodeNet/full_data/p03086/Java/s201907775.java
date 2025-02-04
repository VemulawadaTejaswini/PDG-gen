import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int ans = 0;

        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++) {
                String sub = S.substring(i, j);
                int tmpLen = 0;
                for (int k = 0; k < sub.length(); k++) {
                    if (sub.charAt(k) == 'A' || sub.charAt(k) == 'C' || sub.charAt(k) == 'G' || sub.charAt(k) == 'T') {
                        tmpLen++;
                    }
                }
                ans = Math.max(ans, tmpLen);
            }
        }

        System.out.println(ans);
    }
}
