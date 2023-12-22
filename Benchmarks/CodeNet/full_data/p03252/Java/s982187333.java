import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            String T = in.next();

            int N = S.length();

            HashSet<String> used = new HashSet<String>();
            used.add(S);

            for (int i = 0;;) {

                if (S.equals(T)) {
                    System.out.println("Yes");
                    break;
                }

                char from = S.charAt(i);
                char to = T.charAt(i);
                if (from == to) {
                    i = (i + 1) % N;
                    continue;
                }
                StringBuilder newS = new StringBuilder();
                for (int j = 0; j < N; j++) {
                    char c = S.charAt(j);
                    if (c == from) {
                        newS.append(to);
                    } else if (c == to) {
                        newS.append(from);
                    } else {
                        newS.append(c);
                    }
                }
                S = newS.toString();
                if (!used.add(S)) {
                    System.out.println("No");
                    break;
                }

                i = (i + 1) % N;
            }
        }
    }
}
