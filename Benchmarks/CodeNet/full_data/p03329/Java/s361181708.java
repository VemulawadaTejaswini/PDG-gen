/*
文字列の配列の初期化、整数の型がlongになっているか
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
        int n=sc.nextInt();
        int temp=1;
        TreeSet<Integer> set=new TreeSet<>();
        int exp=1;
        while (temp<=n){
            set.add(temp);
            temp=power(6,exp);
            exp++;
        }
        temp=1;
        exp=1;
        while (temp<=n){
            set.add(temp);
            temp=power(9,exp);
            exp++;
        }
        int[] d=new int[set.size()];
        temp=0;
        while (set.size()>0){
            d[temp++]=set.pollLast();
        }
        int ans=Integer.MAX_VALUE;
        Queue<Integer> q=new ArrayDeque<>();
        q.add(0);
        Queue<Integer> money=new ArrayDeque<>();
        money.add(n);
        while (q.size()>0){
            int p=q.poll();
            int m=money.poll();
            if(m==0){
                ans=min(ans,p);
                out.println(ans);
                exit(0);
            }
            for (int i = 0; i < temp; i++) {
                if(m-d[i]>=0) {
//                    out.println("手数＝"+p+" "+m+"→"+(m-d[i]));
                    q.add(p + 1);
                    money.add(m - d[i]);
                }
            }
        }
        out.print(ans);
    }
    static int power(int x,int n){
        if(n==0)return 1;
        if(n%2==0){
            int e=power(x,n/2);
            return e*e;
        }
       int e=x*power(x,n-1);
        return e;
    }
}