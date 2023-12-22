import java.util.*;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x[]=new int[n];
    int y[]=new int[n];
    for(int i=0;i<n;i++){
      x[i]=sc.nextInt();
      y[i]=sc.nextInt();
    }
    BigDecimal ans=BigDecimal.valueOf(0);
    for(int i=0;i<n;i++){
      for(int k=0;k<n;k++){
        long a=(x[i]-x[k])*(x[i]-x[k])+(y[i]-y[k])*(y[i]-y[k]);
        BigDecimal aa=BigDecimal.valueOf(a);
        aa=sqrt(aa,10);
        ans=ans.add(aa);
      }
    }
    BigDecimal nn=BigDecimal.valueOf(n);
    ans=ans.divide(nn,8,BigDecimal.ROUND_HALF_UP);
    System.out.println(ans);
  }

  public static BigDecimal sqrt(BigDecimal a, int scale){
    BigDecimal x = new BigDecimal(Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
    if(scale < 17) return x;
    BigDecimal b2 = new BigDecimal(2);
    for(int tempScale = 16; tempScale < scale; tempScale *= 2){
      x = x.subtract(x.multiply(x).subtract(a).divide(x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
    }
    return x;
  }
}