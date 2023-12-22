import java.util.*;

class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void out(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        int a = scan.nextInt();
        int b = scan.nextInt();

        int x = a + b;
        int y = a - b;
        int z = a * b;

        if (x <= y) {
            if (y <= z) {
                out(z);
            } else {
                out(y);
            }
        } else {
            if (x <= z) {
                out(z);
            } else {
                out(x);
            }
        }
    }

}