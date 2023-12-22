import java.util.*;

public class Main{

    public static void main(String args[]){

        //配列の宣言
        int[] number = new int[5];
        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
        int ans;

        if(a >= 13){
            ans = b;
        }else if(a >= 6){
            ans = b/2;
        }else{
            ans = 0;
        }

        // 出力
        System.out.println(ans);

    }

}
