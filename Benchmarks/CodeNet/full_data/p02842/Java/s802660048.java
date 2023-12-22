import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%27!=0){
      BigDecimal x=BigDecimal.valueOf(n*25);
      BigDecimal dia=new BigDecimal("27");
      BigDecimal mua=new BigDecimal("1.08");
      BigDecimal one=new BigDecimal("1");
      BigDecimal oneo=new BigDecimal("-1");
      BigDecimal x1=x.divide(dia,0,BigDecimal.ROUND_HALF_UP);
      BigDecimal x2=x1.add(one);
      BigDecimal x3=x1.add(oneo);
      BigDecimal y1=x1.multiply(mua);
      BigDecimal y2=x2.multiply(mua);
      BigDecimal y3=x3.multiply(mua);
      y1=y1.setScale(0,BigDecimal.ROUND_DOWN);
      y2=y2.setScale(0,BigDecimal.ROUND_DOWN);
      y3=y3.setScale(0,BigDecimal.ROUND_DOWN);
      int s1=y1.intValue();
      int s2=y2.intValue();
      int s3=y3.intValue();
      if(s1==n){
        System.out.println(x1);
      }else if(s2==n){
        System.out.println(x2);
      }else if(s3==n){
        System.out.println(x3);
      }else{
        System.out.println(":(");
      }
    }else{
      System.out.println(n/27*25);
    }
  }
}