import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (c > b || a > d) {
            System.out.println(0);
            return;
        }
        int start;
        int end;
        if (a > c) {
            start = a;
        } else {
            start = c;
        }
        if (b > d) {
            end = d;
        } else {
            end = b;
        }
        System.out.println(end - start);
    }

}
