import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();   //基準となる合計額
        int q = X / 100;    //商
        int d = X % 100;    //余り

        for (int i = 0; i < q; ++i){
            if (d >= 5){
                d -= 5;
            } else if (d >= 4){
                d -=4;
            } else if (d >= 3){
                d -=3;
            } else if (d >= 2){
                d -=2;
            } else if (d >= 1){
                d -=1;
            }
        }
        
        //出力
        if (d == 0){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}