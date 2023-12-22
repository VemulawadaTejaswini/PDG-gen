import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      long a = sc.nextLong();
      long b = sc.nextLong();

      long ans = 0;

      long tmp;
      if(a>=b){
        tmp = b;
        b = a;
        a = tmp;
      }

      long ccc = 0;

      for(long i=a;i>0;i/=2){
        if(a%i==0 && b%i==0){
          ans++;
          if(ccc!=0 && i!=1 && ccc%i==0){
            ans--;
          }
          ccc = i;
        }
        if(i%2==1 && i!=1){i++;}
      }

      if(a%5==0 && b%5==0){
        ans++;
      }

      System.out.println(ans);

    }
}
