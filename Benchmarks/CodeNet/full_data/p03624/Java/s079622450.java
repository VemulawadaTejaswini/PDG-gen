import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        PrintWriter out = new PrintWriter(System.out);
        char[] s = S.toCharArray();
        Arrays.sort(s);
        S = new String(s);

        for (int i = 0; i < alphabet.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (alphabet.charAt(i) == S.charAt(j)) {
                    break;
                }
                if (j == S.length() - 1) {
                    result = String.valueOf(alphabet.charAt(i));
                    out.println(result);
                    sc.close();
                    out.flush();
                    return;
                }
            }
        }

        if (result.equals("")) {
            result = "None";
        }

        out.println(result);
        sc.close();
        out.flush();
    }
}