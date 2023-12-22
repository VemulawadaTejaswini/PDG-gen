import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = Long.parseLong(sc.next());
        long w = Long.parseLong(sc.next());
        if (h == 1 || w == 1) {
            System.out.println(1);
        } else if (h % 2 == 0) {
            System.out.println((h / 2) * w);
        } else {
            System.out.println((((h / 2) + 1) * w) - (w / 2));
        }
    }
}