import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        final int k = in.nextInt();
        final String s = in.next();

        int res = 0;
        int len = s.length();
        int left = 0;
        int countZeros = 0;

        for (int right = 0; right < len; ++right) {
            if (s.charAt(right) == '0') {
                countZeros++;
                for (int j = right; j < len && s.charAt(j) == '0'; j++) {
                    right = j;
                }
                while (countZeros > k) {
                    if (s.charAt(left) == '0') {
                        --countZeros;
                        for (int j = left; j < len && s.charAt(j) == '0'; j++) {
                            left = j;
                        }
                    }
                    left++;
                }

            }
            res = Math.max(res, right - left + 1);
        }
        System.out.println(res);
    }
}