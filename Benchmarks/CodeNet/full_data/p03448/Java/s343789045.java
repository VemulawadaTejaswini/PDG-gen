import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nFiveHundred = sc.nextInt();
        int nHundred = sc.nextInt();
        int nFifty = sc.nextInt();
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i <= nFiveHundred; i++) {
            for (int j = 0; j <= nHundred; j++) {
                for (int k = 0; k <= nFifty; k++) {
                    if (500 * i + 100 * j + 50 * k == target) {
                        ++count;
                    }
                }
            }
        }
        System.out.println(count);
    }
}