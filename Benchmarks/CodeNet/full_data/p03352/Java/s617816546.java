import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int b = 1;  //整数
        int p = 2;  //掛ける回数
        
        //Xが1の場合、条件に合致するのは1のみなのでここで終了
        if (b == X){
            System.out.println(1);
            return;
        }
        
        int max = 4;    //1の次に小さいべき乗数
        for (b = 2; b <= X; ++b){
            for (p = 2; p <= X; ++p){
                int expo = (int) Math.pow(b,p);   //べき乗数
                if(expo > X) {  //べき乗数の値がXを超えたらループを抜ける
                    break;
                }
                max = Math.max(expo, max);	//求めたべき乗数と4のうち、大きい方を代入
            }
        }
        
        //出力
        System.out.println(max);
    }
}