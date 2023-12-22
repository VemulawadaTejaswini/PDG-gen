import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = l; i < r && i < l + 2019; i++) {
            for (int j = i + 1; j <= r && j < l + 2019; j++) {
                int mi = i % 2019;
                int mj = j % 2019;
                int mm = (mi * mj) % 2019;
                if (mm < min) {
                    min = mm;
                }
            }
        }
        System.out.println(min);
    }
}
