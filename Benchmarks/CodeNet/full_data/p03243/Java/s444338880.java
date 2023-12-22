import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        // 整数の入力
        int n = sc.nextInt();
        int ans = 0;

        int index= 0;
        while(true) {
            index++;
            int value = index * 111;
            if (value >= n) {
                ans = value;
                break;
            }
        }

        // 出力
        System.out.println(ans);
    }
}
