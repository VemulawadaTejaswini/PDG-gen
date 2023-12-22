import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String S = s.next();

        Set<String> matches = new HashSet<>();
        int stop = N / 2;
        for (int offset = 0; offset <= stop; offset++) {
            for (int len = stop - offset + 1; len >= 1; len--) {
                String str = S.substring(offset, offset + len);

                if (matches.stream().anyMatch(x -> x.startsWith(str))) continue;
                if (S.substring(offset + len).indexOf(str) >= 0) {
                    matches.add(str);
                    break;
                }
            }
        }

        int maxLen = matches.stream().max(Comparator.comparing(String::length)).orElse("").length();
        System.out.println(maxLen);
     }
}
