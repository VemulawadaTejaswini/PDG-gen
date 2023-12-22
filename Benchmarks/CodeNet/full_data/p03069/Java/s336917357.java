

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String S = sc.next();
            List<Integer> counts = new ArrayList<>();
            char prev = S.charAt(0);
            int length = 1;
            for (int i = 1; i < N; i++) {
                if (prev == S.charAt(i)) {
                    length++;
                } else {
                    counts.add(length);
                    length = 1;
                }
                prev = S.charAt(i);
            }
            counts.add(length);

            int result = 0;
            for (int i = (S.charAt(0) == '#' ? 0 : 1); i < counts.size(); i += 2) {
                if ((i + 1) < counts.size()) {
                    int b = counts.get(i);
                    int w = counts.get(i + 1);
                    result += Math.min(b, w);
                }
            }
            System.out.println(result);
        }
    }

}
