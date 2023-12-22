import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        long x = sc.nextLong();
        sc.close();

        Algae(r, D, x, 2000);
    }
    public static void Algae(int r, int D, long x, int index) {
        if (index >= 2010) {
            return;
        }
        long x1 = (r * x - D);
        System.out.println(x1);
        Algae(r, D, x1, index + 1);
    }
}
