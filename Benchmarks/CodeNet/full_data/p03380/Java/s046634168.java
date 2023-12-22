/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
//「全問解く」:1一問も解かない」:0 としてBIT全探索→scoreに値を代入
//例.d=4,i=1011なら「100点、200点、400点の問題を全部解く」
//もしscoreがgに満たなかったら、iのビットを桁が大きいほうからしらべて0ならばその得点の問題を1問ずつ解く
//一問解くたびにscore>=gを確認し、真なら最小値と比較、最小値を下回れば更新しループを抜ける
//もし各回においてscore<gなら、p-1回まで行う
//このようなビットは高々1つでよい（p問解くならそのビットが1になっているのと同じである）
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
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        out.print(a[n-1]+" ");
        int index=0;
        if(a[n-1]%2==0){
            index=Arrays.binarySearch(a,a[n-1]/2);
            if(index>=0){
                out.println(a[n-1]/2);
            }else {
                index=~index;
                if(index==0)out.println(a[0]);
                else if(index==n)out.println(a[n-1]);
                else {
                    if(a[n-1]/2-a[index-1]>a[index]-a[n-1]/2){
                        out.println(a[index]);
                    }else {
                        out.println(a[index-1]);
                    }
                }
            }
        }else {
            index=Arrays.binarySearch(a,a[n-1]/2);
            int index0=Arrays.binarySearch(a,a[n-1]/2+1);
            if(index>=0){
                out.println(a[n-1]/2);
            }else if(index0>=0){
                out.println(a[n-1]/2+1);
            }else {
                index=~index;
                if(a[n-1]/2-a[index-1]>a[index]-a[n-1]/2){
                    out.println(a[index]);
                }else {
                    out.println(a[index-1]);
                }
            }
        }
    }
}