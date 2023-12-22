import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] c = s.toCharArray();
        if (c[0] == 'B') c[0] = ' ';
        for (int i = 1; i < c.length; i++) {
            if (c[i] == 'B') {
                c[i] = ' ';
                c[i - 1] = ' ';
            }
        }

        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') System.out.print(c[i]);
        }


    }
}