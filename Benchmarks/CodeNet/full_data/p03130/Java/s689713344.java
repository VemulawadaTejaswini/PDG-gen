/*
文字列の配列の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int[] cnt=new int[5];
        for (int i = 0; i < 3; i++) {
            int a=sc.nextInt(),b=sc.nextInt();
            cnt[a]++;
            cnt[b]++;
        }
        int d=0;
        for (int i = 1; i <= 4; i++) {
            if(cnt[i]==2)d++;
        }
        if(d==2)out.println("YES");
        else out.println("NO");
    }
}