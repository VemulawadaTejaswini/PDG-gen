import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static final int MODULUS = 1_000_000_007;
    static String TARGET = "ABC";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        System.out.println(solve(S));

        sc.close();
    }

    static int solve(String S) {
        int wildCount = (int) S.chars().filter(ch -> ch == '?').count();
        int[] threePowers = new int[wildCount + 1];
        threePowers[0] = 1;
        for (int i = 1; i < threePowers.length; ++i) {
            threePowers[i] = multiplyMod(threePowers[i - 1], 3);
        }

        int result = 0;
        Map<String, Integer> subToCount = new HashMap<>();
        subToCount.put("", 1);
        for (char ch : S.toCharArray()) {
            Map<String, Integer> nextSubToCount = new HashMap<>();

            for (String sub : subToCount.keySet()) {
                if (sub.length() <= 2) {
                    nextSubToCount.put(sub, nextSubToCount.getOrDefault(sub, 0) + subToCount.get(sub));

                    String nextSub = String.format("%s%c", sub, ch);
                    nextSubToCount.put(nextSub, nextSubToCount.getOrDefault(nextSub, 0) + subToCount.get(sub));
                }
            }

            for (String nextSub : nextSubToCount.keySet()) {
                if (nextSub.length() == 3) {
                    result = addMod(result,
                            computeABCNumber(threePowers, wildCount, nextSub, nextSubToCount.get(nextSub)));
                }
            }

            subToCount = nextSubToCount;
        }

        return result;
    }

    static int addMod(int x, int y) {
        return (x + y) % MODULUS;
    }

    static int multiplyMod(int x, int y) {
        return (int) ((long) x * y % MODULUS);
    }

    static int computeABCNumber(int[] threePowers, int wildCount, String sub, int count) {
        for (int i = 0; i < sub.length(); ++i) {
            if (sub.charAt(i) != '?' && sub.charAt(i) != TARGET.charAt(i)) {
                return 0;
            }
        }

        return multiplyMod(count, threePowers[wildCount - (int) sub.chars().filter(ch -> ch == '?').count()]);
    }
}