import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double n = sc.nextDouble();
      double k = sc.nextDouble();

      double ans = 0;

      for(int i=1;i<=n;i++){
        int xn = 0;
        while(i*(Math.pow(2,xn))<k){
          xn++;
        }
        ans += (1/n)*(Math.pow(0.5,xn));
        xn = 0;
      }


      System.out.println(ans);

    }
}
