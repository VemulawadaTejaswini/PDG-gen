import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] S = new String[s.length()];
        int a = -1;
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            S[i] = s.split("")[i];
        }

        for (int i = 0; i < s.length(); i++) {
            if (S[i].equals("A") && a == -1) {
                a = i;
            }

            if (S[i].equals("Z") && a != -1) {
                length = i - a + 1;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(length);

        sc.close();
        out.flush();
    }
}