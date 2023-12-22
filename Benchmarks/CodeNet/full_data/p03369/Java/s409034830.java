

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int ans = 700;
            String s = sc.next();
            for (char ch : s.toCharArray()) {
                if ( ch == 'o' ) {
                    ans += 100;
                }
            }
            System.out.println(ans);
        }
    }
}
