import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        char[]c=s.toCharArray();
        for (int i = c.length-1; i > 0; i--) {
            if (c[i] == 'B') {
                if (c[i-1]!='B') {
                    c[i-1]=' ';
                }
            }


        }
        for (char value : c) {
            if (value == '0' || value == '1') {
                System.out.print(value);
            }
        }

    }
}