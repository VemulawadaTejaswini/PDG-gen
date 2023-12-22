import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int min = 2018;

        if (l - r >= 2018) {
            System.out.println(0);
        } else {
            for (int i = l; i <= r ; i++) {
                for (int j = i + 1; j <= r ; j++) {
                    int val = (i % 2019 * j % 2019) % 2019;
                    min = Math.min(val , min);
                }
            }
            System.out.println(min);
        }
    }
}