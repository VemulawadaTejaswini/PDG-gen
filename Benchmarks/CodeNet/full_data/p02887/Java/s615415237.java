import java.util.Scanner;

/**
 * Slimes
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            //char[] S = sc.next().toCharArray();
            String S = sc.next();

            int count = 0;
            char c = ' ';
            for (int i = 0; i < N; i++) {
                char c2 = S.charAt(i);

                if (c != c2) {
                    c = c2;
                    count++;
                }
            }

            System.out.println(count);
        }
    }

}
