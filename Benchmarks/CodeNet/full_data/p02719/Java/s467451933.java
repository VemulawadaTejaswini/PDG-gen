import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long k = sc.nextInt();
        boolean end = false;
        while (!end) {
            if (k / 2 < h)
                h = Math.abs(h - k);
            else
                end = true;
        }
        System.out.println(h);
    }
}