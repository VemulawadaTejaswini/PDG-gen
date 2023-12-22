import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        // 変数宣言
        long total = 0;
        long blue = 0;
        long result = 0;
        long n;
        long a;
        long b;

        // 入力
        Scanner sc = new Scanner(System.in);
        
        n = Long.parseLong(sc.next());
        a = Long.parseLong(sc.next());
        b = Long.parseLong(sc.next());

        sc.close();


        //nよりa+bが小さい間だけ実行
        while( total < n ){
            for(long index=0; index < a ; index++){
                if( total < n){
                    blue++;
                    total++;
                }else{
                    break;
                }
            }
            for(long index=0; index < b ; index++ ){
                if( total < n){
                    total++;
                }else{
                    break;
                }
            }
        };

        // resultを出力
        result = blue;
        System.out.println( result );

    }
}