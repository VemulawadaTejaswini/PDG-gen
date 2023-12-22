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
        int[] a=new int[n];
        HashSet<Integer> minset=new HashSet<>();
        int free=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            if(a[i]<400)minset.add(1);
            else if(a[i]<800)minset.add(400);
            else if(a[i]<1200)minset.add(800);
            else if(a[i]<1600)minset.add(1200);
            else if(a[i]<2000)minset.add(1600);
            else if(a[i]<2400)minset.add(2000);
            else if(a[i]<2800)minset.add(2400);
            else {
                minset.add(2800);
                if(a[i]>=3200)free++;
            }
        }
        out.println(minset.size()+" "+(minset.size()+free));
    }
}