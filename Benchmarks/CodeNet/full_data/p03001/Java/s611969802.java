import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int w = sc.nextInt();
        // スペース区切りの整数の入力
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        double ans;
        int b;

        ans = Math.max(Math.min(x * h, (w - x) * h), Math.min(w * y, w * (h - y)));
        if(Math.min(x * h, (w - x) * h) == Math.min(w * y, w * (h - y))) b = 1;
        else b = 0;

        // 出力
        System.out.println(String.format("%.9f", ans) + " " + b);

    }

}
