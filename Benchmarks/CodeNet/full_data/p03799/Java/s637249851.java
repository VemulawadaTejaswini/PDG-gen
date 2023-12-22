import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        while (n > 0 && m > 1) {
            n -= 1;
            m -= 2;
            total++;
        }
        while (m > 3) {
            m -= 4;
            total++;
        }
        System.out.println(total);
    }

}