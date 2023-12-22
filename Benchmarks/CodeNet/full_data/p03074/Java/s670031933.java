import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        final int K = in.nextInt();
        final String s = in.next();

        int ans = 0;
        int len = s.length();
        int left = 0;
        int right = 0;
        int countZeros = 0;

        while (right < len) {
            if (s.charAt(right) == '0') {
                countZeros++;
                for (int j = right + 1; j < len && s.charAt(j) == '0'; j++) {
                    right = j;
                }
                while (countZeros > K) {
                    if (s.charAt(left) == '0') {
                        --countZeros;
                        for (int j = left; j < len && s.charAt(j) == '0'; j++) {
                            left = j;
                        }
                    }
                    left++;
                }

            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        System.out.println(ans);
    }
}