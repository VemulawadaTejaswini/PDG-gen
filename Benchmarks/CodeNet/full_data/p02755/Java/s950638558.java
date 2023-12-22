import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 1;
        while (n < 2000) {
            if (n / 10 == b && (int)(n * 0.08) == a) {
                System.out.println(n);
                return;
            }
            n++;
        }
        System.out.println(-1);
    }
}
