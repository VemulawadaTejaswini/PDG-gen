import java.util.*;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    int[][] x=new int[n][d];
    int ans=0;
    BigDecimal z=BigDecimal.valueOf(0);
    for(int i=0;i<n;i++){
      for(int k=0;k<d;k++){
        x[i][k]=sc.nextInt();
      }
      for(int j=0;j<i;j++){
        long a=0;
        for(int k=0;k<d;k++){
          a=a+(x[i][k]-x[j][k])*(x[i][k]-x[j][k]);
        }
        BigDecimal aa=BigDecimal.valueOf(a);
        aa=sqrt(aa,5);
        BigDecimal b=aa.setScale(0,BigDecimal.ROUND_DOWN);
        b=aa.subtract(b);
        if(b.compareTo(z)==0){
          ans++;
        }
      }
    }
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