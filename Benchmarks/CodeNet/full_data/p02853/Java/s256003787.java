import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = 0;
        if (x == 1 && y == 1) {
            c += 400000;
        }
        if (x == 1) {
            c += 300000;
        }
        if (x == 2) {
            c += 200000;
        }
        if (x == 3) {
            c += 100000;
        }
        if (y == 1) {
            c += 300000;
        }
        if (y == 2) {
            c += 200000;
        }
        if (y == 3) {
            c += 100000;
        }

        System.out.println(c);

    }

}