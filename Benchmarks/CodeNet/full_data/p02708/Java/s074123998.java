    import java.util.*;
    public class Main{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n= Integer.parseInt(sc.next());
        int k= Integer.parseInt(sc.next());
        long ans=0L;
        long mod=1000000007;
        for(;k<=n+1;k++){
          ans+=(n-k+1)*k+1;
          ans=ans%mod;
        }
        System.out.println(ans);
      }
    }