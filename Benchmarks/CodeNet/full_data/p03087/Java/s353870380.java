
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        String S = scanner.next();

        boolean flag = false;
        char[] charArray = S.toCharArray();
        int count = 0;
        int[] ret = new int[N];
        for (int i = N-1; i >= 0; i--) {
            char c = charArray[i];
            if (c == 'C') {
                flag = true;
            } else if (c == 'A') {
                if (flag) {
                    count++;
                }
                flag = false;
            } else {
                flag = false;
            }
            ret[i] = count;
        }

        for (int i = 0; i < Q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            System.out.println(ret[l-1]-ret[r-1]);
        }
    }

}
