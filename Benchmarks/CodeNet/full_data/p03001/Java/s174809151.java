import java.util.*;

public class C{

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
        double a = 0.0, b = 0.0;
        int c = 0;

        if((x == 0 || x == w) && (y == 0 || y == h)){
            a = w * h / 2.0; b = w * h / 2.0;
            c = 1;
        }else if(x == 0 || x == w){
            a = Math.min(x * h, (w - x) * h); b = Math.min(w * y, w * (h - y)); //a0
            c = 0;
        }else if(y == 0 || y == h){
            a = Math.min(x * h, (w - x) * h); Math.min(w * y, w * (h - y)); //b0
            c = 0;
        }else{
            a = Math.min(x * h, (w - x) * h); b = Math.min(w * y, w * (h - y));
            if(a == b) c = 1;
        }
        ans = Math.max(a, b);

        // 出力
        System.out.println(String.format("%.9f", ans) + " " + c);

    }

}
