import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] c = s.toCharArray();

        Arrays.sort(c);
        char a = 'a';
        for (int i = 0; i < c.length; i++) {
            if (a == c[i]) {
                a++;
            } else if (i > 0 && c[i] == c[i-1]) {
                continue;
            } else {
                System.out.println(a);
                System.exit(0);
            }
        }

        System.out.println("None");
    }
}
