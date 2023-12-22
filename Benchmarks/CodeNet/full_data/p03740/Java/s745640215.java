import java.util.*;

public class Main {
    public void main(Scanner sc) {
        long x = sc.nextLong();
        long y = sc.nextLong();

        System.out.println(Math.abs(x - y) <= 1 ? "Bob" : "Alice");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
