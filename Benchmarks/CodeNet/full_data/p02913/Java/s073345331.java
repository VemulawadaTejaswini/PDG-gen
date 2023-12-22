import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String S = s.next();

        Set<String> dups = new HashSet<>();
        int stop = N / 2;
        for (int offset = 0; offset <= stop; offset++) {
            for (int len = 1; len <= stop - offset + 1; len++) {
                String str = S.substring(offset, offset + len);
                if (dups.contains(str)) continue;
                if (S.substring(offset + len).indexOf(str) >= 0) dups.add(str);
            }
        }

        int maxLen = dups.stream().max(Comparator.comparing(String::length)).orElse("").length();
        System.out.println(maxLen);
     }
}
