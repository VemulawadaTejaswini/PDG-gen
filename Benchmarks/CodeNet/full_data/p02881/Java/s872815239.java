import java.util.*;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    BigDecimal n1=BigDecimal.valueOf(n);
    BigDecimal nn=sqrt(n1,1);
    nn=nn.setScale(0,BigDecimal.ROUND_UP);
    int a=nn.intValue();
    long x=1;
    long y=1;
    for(int i=a;i>0;i--){
      if(n%i==0){
        x=i;
        y=n/i;
        break;
      }
    }
    System.out.println(x+y-2);
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