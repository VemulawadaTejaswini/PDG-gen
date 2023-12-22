import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int L=sc.nextInt();
      int R=sc.nextInt();

      //0 < L <= i < j <= R

      int mod,ii,jj;
      int ans = 2019;
if(R-L<2019){
      for(int i=L;i<R;i++){
        ii = i % 2019;
        for(int j=i+1;j<=R;j++){
          jj = j % 2019;
          mod = (ii*jj) % 2019;
          if(mod<ans) ans=mod;
        }
      }
      System.out.println(ans);
}
else{
  for(int i=L;i<2019;i++){
    ii = i % 2019;
    for(int j=i+1;j<=2019;j++){
      jj = j % 2019;
      mod = (ii*jj) % 2019;
      if(mod<ans) ans=mod;
    }
  }
  System.out.println(ans);
}

    }
}
