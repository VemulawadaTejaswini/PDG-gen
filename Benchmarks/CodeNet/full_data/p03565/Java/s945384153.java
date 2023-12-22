import java.util.Scanner;

public class Main {

    static final String UNRESTORABLE = "UNRESTORABLE";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String part = scanner.next();
        String T = scanner.next();

        int start = 0;
        int end = 0;
        int indexInT = T.length() - 1;

        for (int i = part.length()-1; i >= 0; i--) {
            char charInT = T.charAt(indexInT);
            char c = part.charAt(i);

            if (c == charInT || c == '?') { // match or wildcard
                if (indexInT == (T.length() - 1)) end = i;
                indexInT--;
                if ((end - i) == (T.length()-1)) {
                    start = i;
                    break;
                }
            } else { // not match
                indexInT = T.length() - 1;
                if (c == T.charAt(indexInT)) {
                    end = i;
                    indexInT--;
                }
            }
        }

        //System.out.println(String.format("start: %d, end: %d", start, end));

        if ((end - start) != (T.length()-1)) {
            System.out.println(UNRESTORABLE);
            return;
        }

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

        System.out.println(sb.toString());
    }

}