
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int a = in.nextInt();
        final int b = in.nextInt();
        final int c = in.nextInt();
        final int d = in.nextInt();

        final String input = in.next();
        if (input.indexOf("##", a) < c && input.indexOf("##", a) > -1) {
            System.out.println("No");
            return;
        }
        if (input.indexOf("##", b) < d && input.indexOf("##", b) > -1) {
            System.out.println("No");
            return;
        }

        if (c < b) {
            System.out.println("Yes");
            return;
        }

        final char[] line = input.toCharArray();
        if (d > c) {
            System.out.println("Yes");
            return;
        }

        if (line[d - 2] == '.') {
            if (c == d + 1) {
                System.out.println("Yes");
                return;
            }
            if (line[d] == '.') {
                System.out.println("Yes");
                return;
            }
        }


        if (line[b] == '.') {
            if (a == b - 1 || line[b - 2] == '.') {
                System.out.println("Yes");
                return;
            }
        }
        if (input.indexOf("...", b - 1) != -1) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No4");
    }
}
