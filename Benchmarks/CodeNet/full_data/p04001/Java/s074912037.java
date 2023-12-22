import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length() - 1;
        long result = 0;

        for (int i = 0; i < Math.pow(2, len); i++) {
            StringBuilder sb = new StringBuilder(s);
            for (int j = len - 1; j >= 0; j--) {
                if ((1 & i >> j) == 1) {
                    sb.insert(j+1, "+");
                }
            }
            String[] numstr = sb.toString().split("\\+", 0);
            result += Arrays.stream(numstr).mapToLong(Long::parseLong).sum();
        }
        System.out.println(result);

    }
}