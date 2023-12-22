import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        // 整数の入力
        String s = sc.next();
        int nearestGap = Integer.MAX_VALUE;

        for(int i = 0; i < s.length() - 2; i++) {
            int value = Integer.parseInt(s.substring(i, i + 3));
            int gap = Math.abs(753 - value);
            if (gap < nearestGap) {
                nearestGap = gap;
            }
        }

        // 出力
        System.out.println(nearestGap);
    }
}