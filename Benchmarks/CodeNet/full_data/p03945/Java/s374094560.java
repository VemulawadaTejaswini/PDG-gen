mport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();

            StringBuilder WB = new StringBuilder();
            WB.append(S.charAt(0));
            for (int i = 1; i < S.length(); i++) {
                if (S.charAt(i) == S.charAt(i - 1)) {
                    continue;
                } else {
                    WB.append(S.charAt(i));
                }
            }

            System.out.println(WB.length() - 1);
        }
    }
}
