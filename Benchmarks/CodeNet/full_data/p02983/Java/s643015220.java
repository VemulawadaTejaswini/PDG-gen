import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        // 初期位置を計算する
        int start = l % 2019;
        if (start != 0) {
            if (l + (2019 - start) <= r) {
                start = 0;
            } else {
                start = (start * (start + 1)) % 2019;
            }
        }

        System.out.println(start);
    }
}
