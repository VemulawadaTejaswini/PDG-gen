import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int L=sc.nextInt();
      int R=sc.nextInt();

      //0 < L <= i < j <= R

      int mod,ii,jj;
      int ans = 2019;
      int cnt =0;

      for(int i=L;i<R;i++){
        ii = i % 2019;
        for(int j=i+1;j<=R;j++){
          jj = j % 2019;
          mod = (ii*jj) % 2019;
          if(mod<ans) ans=mod;
          if(ans==0){break;}
        }
        if(ans==0){break;}
      }
      System.out.println(ans);

//kan nin gu

    }
}
