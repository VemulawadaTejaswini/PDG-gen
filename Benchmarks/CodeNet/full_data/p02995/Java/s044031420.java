import java.util.*;
import java.io.*;

class Gcd{
    
    public static long gcd(long m, long n){
        if(n==0) {return m;}
        if(m >= n) {return gcd(n, m % n);}

        if(m==0) {return n;}
        if(m < n) {return gcd(m, n % m);}

        return 0;
    }
    
}

public class Main{

    static int INFTY = Integer.MAX_VALUE;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long ans=0;
        
        //0からBまでのCの倍数
        //0からA-1までのCの倍数
        long cNum=B/C-(A-1)/C;

        //0からBまでのDの倍数
        //0からA-1までのDの倍数
        long dNum=B/D-(A-1)/D;
        

        long maxKouyakusuu =C*D/Gcd.gcd(C,D);
        //0からBまでのC,Dの最小公倍数の倍数
        //0からA-1までのC,Dの最小公倍数の倍数
        long kouyakuNum=B/maxKouyakusuu-(A-1)/maxKouyakusuu;

        ans=(B-A+1)-(cNum+dNum-kouyakuNum);

        System.out.println(ans);
       

    }


}