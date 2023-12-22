import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = kys(a,b);
        long res = 1;
        res = res + bk(c,1,0);
        System.out.println(res);
    }
    static long kys(long a,long b){
        if(b == 0){return a;}
        return kys(b,a % b);
    }
    static long bk(long c,long j,long plus){
        if(c == 1){return plus;}else{
            if(j == 1){
                if(c % 2 == 0){
                    plus++;
                    return wr(c,2,plus);
                }
            }else{
                if(j == 2){j = 3;}
                for(long i = j;i<=c;i=i+2){
                    if(c % i == 0){
                        plus++;
                        return wr(c,i,plus);
                    }
                }
            }
        }
        return plus;
    }
    static long wr(long c,long i,long plus){
        while(c % i == 0){
            c = c / i;
        }
        return bk(c,i,plus);
    }
}
