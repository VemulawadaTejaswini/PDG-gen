/*
文字列の配列の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
 */
import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        Queue<Integer> water=new ArrayDeque<>();
        Queue<Integer> sugar=new ArrayDeque<>();
        String ans="";
        water.add(100*a);
        sugar.add(0);
        water.add(100*b);
        sugar.add(0);
        double density=0;
        while (!water.isEmpty()){
            int w=water.poll(),s=sugar.poll();
            int mass=w+s;
            if((double)s*100/(double)(s+w)>density){
                density=(double)s*100/(double)(s+w);
                ans=(s+w)+" "+s;
            }
            //操作1
//            if(w+100*a+s<=f&&s<=(w+100*a)/100*e){
            if(check12(w,a,s,e,f)){
                water.add(w+100*a);
                sugar.add(s);
            }
            //操作2
            if(check12(w,b,s,e,f)){
                water.add(w+100*b);
                sugar.add(s);
            }
            //操作3
            if(check34(w,c,s,e,f)){
                water.add(w);
                sugar.add(s+c);
            }
            //操作4
            if(check34(w,d,s,e,f)){
                water.add(w);
                sugar.add(s+d);
            }
        }
        out.println(ans);
    }
    static boolean check12(int water,int x,int sugar,int e,int f){
        return water+100*x+sugar<=f&&sugar<=(water+100*x)/100*e;
    }
    static boolean check34(int water,int x,int sugar,int e,int f){
        return water+sugar+x<=f&&sugar+x<=water/100*e;
    }
}