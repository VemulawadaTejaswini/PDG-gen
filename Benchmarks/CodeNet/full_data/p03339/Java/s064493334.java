import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int result = n;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int cntA = s.substring(0, i).replaceAll("E", "").length();
            int cntB = s.substring(i + 1).replaceAll("W", "").length();

            count = cntA + cntB;

            if (count < result) {
                result = count;
            }

        }
        System.out.println(result);

    }
}