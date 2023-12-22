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
        int n=sc.nextInt();
        int free=0;
        int[] cnt=new int[8];
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            if(a<400)cnt[0]++;
            else if(a<800)cnt[1]++;
            else if(a<1200)cnt[2]++;
            else if(a<1600)cnt[3]++;
            else if(a<2000)cnt[4]++;
            else if(a<2400)cnt[5]++;
            else if(a<2800)cnt[6]++;
            else if(a<3200)cnt[7]++;
            else free++;
        }
        int minimum=0,maximum=0;
        for (int i = 0; i < 8; i++) {
            if(cnt[i]>0)minimum++;
        }
        if(minimum==0){
            minimum=1;
            maximum=free;
        }
        else maximum=minimum+free;
        out.println(minimum+" "+maximum);
    }
}