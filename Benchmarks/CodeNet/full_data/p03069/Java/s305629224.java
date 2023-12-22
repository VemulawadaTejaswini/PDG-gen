import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int ans = 0;
        boolean hasBlack = false;

        int blackCount = 0;

        for (char c : s) {
            if (hasBlack && c == '.') {
                ans++;
            }
            if (c == '#') {
                blackCount++;
                if (!hasBlack) {
                    hasBlack = true;
                }
            }
        }

        System.out.println(Math.min(ans, blackCount));
    }
}