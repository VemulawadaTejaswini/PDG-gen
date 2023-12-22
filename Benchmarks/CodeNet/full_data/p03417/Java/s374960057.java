import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n,m;
        while(cin.hasNext()){
            n = cin.nextInt();
            m = cin.nextInt();
            if(n>m){
                int t;
                t = n;
                n = m;
                m = t;
            }
            if(n==1){
                if(m>=2){
                    System.out.println(m-2);
                }
                else
                    System.out.println('0');
            }
            else if(n==m){
                System.out.println('0');
            }
            else{
                BigInteger a,b;
                a = BigInteger.valueOf(n);
                b = BigInteger.valueOf(m);
                BigInteger ans;
                ans = a.multiply(b);

                ans = ans.subtract(a);
                ans = ans.subtract(a);
                ans = ans.subtract(b);
                ans = ans.subtract(b);
                ans = ans.subtract(BigInteger.valueOf(4));
                System.out.println(ans);
            }

        }
    }
}
