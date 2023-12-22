import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = 0;
        int min2=0;
        int max =0;
        int ans =0;
//        どれかが偶数ならば、０
//        全部奇数ならば、小さいやつ２つの積
        if(a%2==1&& b%2==1&& c%2 == 1){
            min =Math.min(a,b);
            max =Math.max(a,b);
            min2 = Math.min(max, c);
            ans = min* min2;
            System.out.println(ans);
        }else{
            System.out.println(0);
        }





    }
}
