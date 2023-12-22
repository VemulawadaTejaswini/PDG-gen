import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long total = 0;
        long n = sc.nextInt();
        long m = sc.nextInt();
        while (n >= 1 && m >= 2) {
            n -= 1;
            m -= 2;
            total++;
        }
        while (m >= 4) {
            m -= 4;
            total++;
        }
        System.out.println(total);
    }

}
