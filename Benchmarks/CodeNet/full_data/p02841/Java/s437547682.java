import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = Integer.parseInt(sc.next());
        int m2 = Integer.parseInt(sc.next());
        int d1 = Integer.parseInt(sc.next());
        int d2 = Integer.parseInt(sc.next());

        if (d2 == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
