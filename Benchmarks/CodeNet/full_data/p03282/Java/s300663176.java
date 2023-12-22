import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            char[] s = sc.next().toCharArray();
            long k = sc.nextLong();

            long i = 0L;
            for (; i < s.length; i++) {
                if (s[(int) i] != '1') {
                    i++;
                    break;
                }
            }
            // if(s.length == i && k > i) {
            // System.out.println();
            // return;
            // }

            if (k > i) {
                System.out.println(s[(int) i - 1]);
                return;
            }
            System.out.println(1);
        }
    }
}
