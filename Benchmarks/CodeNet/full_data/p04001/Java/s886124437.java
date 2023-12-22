import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int roopCount = input.length() - 1;// 文字の間の数だけbit全探索する
        long ans = 0;

        for (int i = 0; i < Math.pow(2.0, (double)roopCount); i++) {

            StringBuilder sb = new StringBuilder(input);

            for (int j = roopCount - 1; j >= 0; j--) {
                if ((1 & i >> j) == 1) {// 順番にビットが1になってる箇所を探していく
                    sb.insert(j+1, "+");
                }
            }

            String[] str = sb.toString().split("\\+", 0);
            for (int j = 0; j < str.length; j++) {
                ans += Long.parseLong(str[j]);
            }
        }

        System.out.println(ans);
    }
}
