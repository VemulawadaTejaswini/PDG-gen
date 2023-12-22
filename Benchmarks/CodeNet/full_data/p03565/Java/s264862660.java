import java.util.Scanner;

public class Main {

    static final String UNRESTORABLE = "UNRESTORABLE";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String part = scanner.next();
        String T = scanner.next();
        int start = 0;
        int end = 0;
        int indexInT = 0;

        for (int i = 0; i < part.length(); i++) {
            char charInT = T.charAt(indexInT);
            char c = part.charAt(i);

            //System.out.println(String.format("charInT: %s, c: %s", charInT, c));

            if (part.length() - i < T.length() - indexInT) {
                System.out.println(UNRESTORABLE);
                return;
            }

            if (c == charInT || c == '?') { // match or wildcard
                if (indexInT == 0 ) start = i;
                indexInT++;
                if (indexInT == T.length()) {
                    end = i;
                    break;
                }
            } else { // not match
                indexInT = 0;
            }
        }

        //System.out.println(String.format("start: %d, end: %d", start, end));
        //`System.out.println(String.format("wildcards: %s", wildcards));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < start; i++) {
            char c = part.charAt(i);
            if (part.charAt(i) == '?') {
                sb.append('a');
            } else {
                sb.append(c);
            }
        }

        sb.append(T);

        for (int i = end; i < part.length() - 1; i++) {
            sb.append('a');
        }

        //System.out.println(String.format("result : %s", sb.toString()));
        System.out.println(sb.toString());
    }
}