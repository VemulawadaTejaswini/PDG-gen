import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < N; i++) {
            int tmp = scan.nextInt() % 4;
            if (tmp == 0) {
                a++;
            }
            else if(tmp == 2) {
                b++;
            }
            else {
                c++;
            }
        }
        c -= a * 2;
        if(c < 0) {
            System.out.println("Yes");
        }
        if (c == 0) {
            if (b == 1) {
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
            return;
        }

        b -= 2 * c;
        if (b < 2) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}
