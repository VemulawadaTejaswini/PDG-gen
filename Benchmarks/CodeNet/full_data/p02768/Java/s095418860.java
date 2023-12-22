import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n=sc.nextInt();
        long a=sc.nextInt();
        long b=sc.nextInt();
        long ansa=1;
        long ansb=1;
        long ansn=1;
        for(int i=0;i<n;i++){
            ansn=adjust(ansn*2);
        }
        for(int i=0;i<a;i++){
            ansa=adjust(ansa*2);
        }
        for(int i=0;i<b;i++){
            ansb=adjust(ansb*2);
        }
        long ans=adjust(ansn-ansa-ansb+1);
        System.out.println(ans);
    }
    static long adjust(long a){
        long q=a/1000000007;
        return (a-q*1000000007);
    }

}