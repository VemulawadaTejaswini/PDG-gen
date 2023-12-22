import java.util.Map.Entry;
import java.util.*;

import org.w3c.dom.css.Counter;

public class Main {
//public class App {

    public static void main(String[] args){
     //スキャン
     Scanner s = new Scanner(System.in);
     // 入力
        long n = s.nextInt();
        long an = 0;
    for(long i = 1 ;i<=n;i++){
        for(long i2 =1; i2 <= i;i2++){
            for(long i3 =1; i3 <= i2;i3++){
                long huge = hogehoge(i,i2);
                huge = hogehoge(huge,i3);
                if(i == i2 && i2==i3){
                    an += huge;
                }else if(i ==i2 || i2 ==i3){
                    an += huge*3;
                }else{
                    an += huge *6;
                }

            }
        }
    }
    System.out.println(an);
}
    public static long  hogehoge(long a , long b){
        long tmp;
        long x =a;
        long y=b;
        while((tmp = x % y) != 0){
            x = y;
            y = tmp;
        }
        return y;
    }
}


