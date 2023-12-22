import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            double N = sc.nextDouble();
            double K = sc.nextDouble();
        sc.close();
        
        double tmp = 0.0;
        double ans = 0.0;

        for(int i = 1 ; i <= N ; i++){
            if(i>=K){
                tmp = N;
                ans += 1/tmp;
            }
            else{
            int p = bekijou(i,K,0);

            tmp = N*bekijou2(2,p);
            ans += 1/tmp;
            //System.out.println(bekijou2(2,p));
            //System.out.println(ans);
            }
        }
        System.out.println(ans);
    }

    static int bekijou(int a,double b,int c){
        if(a < b){
            return bekijou(a*2,b,c+1);
        }
        else{
            return c;
        }
    }

    static int bekijou2(int a,int b){
        if(b==1){
            return a;
        }
        else{
            return bekijou2(a * 2,b-1);
        }
    }
}
