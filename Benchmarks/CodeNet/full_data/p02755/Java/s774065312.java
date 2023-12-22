import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int p = 0; p <= 1000; p++) {
            if ((2 * p) / 25 == a && p / 10 == b) {
                System.out.println(p);
                return;
            }
        }
        System.out.println(-1);
    }
}
