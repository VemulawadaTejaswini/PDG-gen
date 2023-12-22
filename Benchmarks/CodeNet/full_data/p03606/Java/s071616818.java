import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[][] ebishu = new int[2][n];
                long yono = 0;
                for(int vip = 0 ; vip < n ; vip++){
                        for(int pct = 0 ; pct < 2 ; pct++){
                                ebishu[pct][vip] = sc.nextInt();
                        }
                        yono += ebishu[1][vip] - ebishu[0][vip];
                        yono++;
                }
                System.out.println(yono);
        }
}
//変数宣言で遊べるの楽しいですね
//twitterフォロー推奨:@Ebishu_