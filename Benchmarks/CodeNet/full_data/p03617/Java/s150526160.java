import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long Q = sc.nextLong();
        long H = sc.nextLong();
        long S = sc.nextLong();
        long D = sc.nextLong();
        long n = sc.nextLong();
        long N = 4*n;
        long ans = 0;
        if(D<=2*S&&D<=4*H&&D<=8*Q){
            ans += D*(N/8);
            N=N%8;
        }
        if(S<=2*H&&S<=4*Q){
            ans += S*(N/4);
            N=N%4;
        }
        if(H<=2*Q){
            ans += H*(N/2);
            N=N%2;
        }
        ans += N;
        System.out.println(ans);
    }
}
