import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String a = in.next();
            String b = in.next();
            String c = in.next();

            String[] Sabc = new String[] { a, b, c, };
            int[] index = new int[3];
            int current = 0;
            for (;;) {
                if (index[current] >= Sabc[current].length()) {
                    System.out.println((char) ('A' + current));
                    return;
                }
                current = Sabc[current].charAt(index[current]++) - 'a';
            }
        }
    }
}
