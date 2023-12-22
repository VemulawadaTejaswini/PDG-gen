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
        String ans=0+" "+0;
        double density=0;
        for (int i = 0; i<40 ; i++) {
            for (int j = 0; j<40 ; j++) {
                if((i*a+j*b)*100<=f)water.add((i*a+j*b)*100);
            }
        }
        for (int i = 0; i<3010 ; i++) {
            for (int j = 0; j<3010 ; j++) {
                if(i*c+j*d<=f)sugar.add(i*c+j*d);
            }
        }
        for (Integer j:water){
            for (Integer k:sugar){
                if((double)k/(double)(j+k)>=density&&j+k<=f&&k<=j/100*e){
                    density=(double)k/(double)(j+k);
                    ans=(j+k)+" "+k;
                }
            }
        }
        out.println(ans);
    }
}