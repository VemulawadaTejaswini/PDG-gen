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
        if (2 * b >= c && b != 1) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
