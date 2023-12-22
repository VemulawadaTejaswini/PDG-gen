import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long q = sc.nextInt();
        long h = sc.nextInt();
        long s = sc.nextInt();
        long d = sc.nextInt();
        long n = sc.nextInt();
        long t = Math.min(8*q, 4*h);
        long t2 = Math.min(t, 2*s);
        long t3 = Math.min(t2, d);
        long ans = 0;
        if(t3 == 8*q){
            ans = q*4*n;
        }else if(2*q != h &&t3 == 4*h){
            ans = h * 2 * n;
        }else if(4*q != s && 2*h != s && t3 == s*2){
            ans = s*n;
        }else if(8*q != d && 4*h != d && 2*s!= d && t3 == d){
            ans += d*(n/2);
            if(t2 == 2*s){
                ans += s*(n%2);
            }else if(s != 2*h && t2 == 4*h){
                ans += 2*h*(n%2);
            }else if(s != 2*h && h != 2*q && t2 == 8*q){
                ans += 4*q*(n%2);
            }
        }
        System.out.println(ans);




    }
}
