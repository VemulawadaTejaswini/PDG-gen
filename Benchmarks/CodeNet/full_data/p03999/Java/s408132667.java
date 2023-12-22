import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //要素数
        int n = str.length()-1;
        //最終的な合計を格納する値
        long total = 0;
        
        //ビット全探索で探索を行う
        for(int i = 0; i < Math.pow(n,2); i++){
            String ans = new String();
            for(int j = 0; j <= n; j++){
                ans += Character.toString(str.charAt(j));
                //+を挟むタイミングでans文字列に格納してある数だけ合計に足す
                if((1 & i >> j) == 1){
                    total += Long.parseLong(ans);
                    ans = new String();}
            }
            total += Long.parseLong(ans);
        }
        System.out.println(total);
    }
}