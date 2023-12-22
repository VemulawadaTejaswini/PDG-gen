import java.util.Scanner;

public class Main {
    public static long kaijou(long n){
        if(n==1)return 1%1000000007;
        else return n*kaijou(n-1)%1000000007;
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