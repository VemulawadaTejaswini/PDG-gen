import static java.lang.Integer.max;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt() + 2;
        int A = sc.nextInt() - 1;
        int B = sc.nextInt() - 1;
        int C = sc.nextInt() - 1;
        int D = sc.nextInt() - 1;

        String str = sc.next();
        char c[] = str.toCharArray();

        //c[A] = 'A';
        //c[B] = 'B';
        //c[C] = 'C';
        //c[D] = 'D';
        boolean flag = true;
        for (int i = B; i < c.length; i++) {
            if (i + 1 == D || i + 2 == D) {
                break;
            }
            if (c[i + 1] != '.' && c[i + 2] != '.') {
                flag = false;
            }
        }
        for (int i = A; i < c.length; i++) {
            if (i + 1 == B || i + 2 == B) {
                break;
            }
            if (c[i + 1] != '.' && c[i + 2] != '.') {
                flag = false;
            }
        }

        if (C > D) {
            if (str.indexOf("...") == -1) {
                if (c[D - 1] == '#' || c[D + 1] == '#') {
                    flag = false;
                }
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
