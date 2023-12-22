/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int[] a=new int[10];
        for (int i = 0; i < 4; i++) {
            a[sc.nextInt()]=1;
        }
        if(a[1]+a[9]+a[7]+a[4]==4)out.println("YES");
        else out.println("NO");
    }
}