
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] temp = scanner.nextLine().split(" ");
        int N = new Integer(temp[0]);
        int Q = new Integer(temp[1]);

        String S = scanner.nextLine();

        for (int i = 0; i < Q; i++) {
            temp = scanner.nextLine().split(" ");
            int l = new Integer(temp[0]);
            int r = new Integer(temp[1]);

            String str = S.substring(l-1, r);
            boolean flag = false;
            int count = 0;
            for (char c : str.toCharArray()) {
                if (c == 'A') {
                    flag = true;
                } else if (c == 'C') {
                    if (flag) {
                        count++;
                    }
                    flag = false;
                } else {
                    flag = false;
                }
            }
            System.out.println(count);
        }
    }


}
