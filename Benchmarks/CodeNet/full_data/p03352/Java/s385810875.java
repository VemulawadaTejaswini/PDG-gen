import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println(1);
            return;
        }
        int max = 1;
        for (int i = 2; i <= x; i++) {
            for (int j = 2; (int)Math.pow(i, j) <= x; j++) {
                max = (int)Math.pow(i, j);
            }
        }
        System.out.println(max);
    }
}