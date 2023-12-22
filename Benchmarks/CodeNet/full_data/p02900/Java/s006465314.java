import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      long a = sc.nextLong();
      long b = sc.nextLong();

      long ans = 1;

      long gcdab = euku(a,b);

      int n = (int)Math.sqrt(gcdab);

      for(int i=2;i<=n;i++){
        if(gcdab%i==0){
          ans++;
          while(gcdab%i==0){
            gcdab /= i;
          }
        }
      }

      if(gcdab!=1){
        ans++;
      }

      System.out.println(ans);

    }

    public static long euku(long a,long b){

      if(a%b!=0){
        return euku(b,a%b);
      }
      else{
        return b;
      }

    }

}
