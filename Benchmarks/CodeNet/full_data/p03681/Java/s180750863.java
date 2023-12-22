import java.util.Scanner;

public class Main {
    static long mod=(long)1e9+7; 
    public static long kaijou(long n){
        long a=1;
        for(long i=1;i<=n;i++){
            a=a*i%mod;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N=sc.nextLong();
        long M=sc.nextLong();
        if(N==M){
            System.out.println(kaijou(N)*kaijou(M)*2%1000000007);
        }else if(N==M-1||M==N-1){
            System.out.println(kaijou(N)*kaijou(M)%1000000007);
        }else{
            System.out.println("0");
        }
        
    }
}
