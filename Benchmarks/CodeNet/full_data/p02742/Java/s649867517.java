import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong(), w = sc.nextLong();

        if (h == 1 || w == 1) {
            System.out.println(1);
            return;
        }

        long base = h * w;

        if (base % 2 == 0) {
            System.out.println(base / 2);
            return;
        } else System.out.println(base / 2 + 1);
    }
}