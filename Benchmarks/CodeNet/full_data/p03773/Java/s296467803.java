import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        System.out.println((n + m) % 24);

        sc.close();
    }
}