import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.next()), q = Integer.parseInt(sc.next()), r = Integer.parseInt(sc.next());

        int min = Math.min(Math.min(p + q, q + r), r + p);
        System.out.println(min);
    }
}
