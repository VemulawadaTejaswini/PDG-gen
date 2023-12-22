import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        // 変数宣言
        int total = 0;
        int red = 0;
        int blue = 0;
        int result = 0;
        int n;
        int a;
        int b;

        // 入力
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        a = Integer.parseInt(sc.next());
        b = Integer.parseInt(sc.next());

        sc.close();


        //nよりa+bが小さい間だけ実行
        while( total < n ){
            for(int index=0; index < a ; index++){
                if( total < n){
                    red++;
                    total++;
                }else{
                    break;
                }
            }
            for(int index=0; index < b ; index++ ){
                if( total < n){
                    blue++;
                    total++;
                }else{
                    break;
                }
            }
        };

        // resultを出力
        result = red;
        System.out.println( result );

    }
}