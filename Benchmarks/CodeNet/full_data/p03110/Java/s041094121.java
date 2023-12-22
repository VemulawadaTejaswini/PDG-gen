import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double yenSum = 0;
        double btcSum = 0;

        for(int i = 0; i < n; i++) {
            double value = sc.nextDouble();
            if ("JPY".equals(sc.next())) {
                yenSum += value;
            } else {
                btcSum += value;
            }
        }

        // 出力
        System.out.println(yenSum + btcSum * 380000);
    }
}