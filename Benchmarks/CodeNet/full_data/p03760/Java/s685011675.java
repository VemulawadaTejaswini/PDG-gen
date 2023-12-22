import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String O = in.next();
            String E = in.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < E.length(); i++) {
                sb.append(O.charAt(i));
                sb.append(E.charAt(i));
            }
            if (O.length() > E.length()) {
                sb.append(O.charAt(O.length() - 1));
            }
            System.out.println(sb.toString());
        }
    }
}
