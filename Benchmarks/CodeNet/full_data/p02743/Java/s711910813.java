import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    BigDecimal a = new BigDecimal(data[0]);
    BigDecimal b = new BigDecimal(data[1]);
    BigDecimal c = new BigDecimal(data[2]);
    
    String result = sqrt(a, 50).add(sqrt(b, 50)).compareTo(sqrt(c, 50))< 0 ? "Yes" : "No";
    
    System.out.println(result);
  }
  
  
  private static long longSqrt (long a) {
    long b = 2*(long)Math.sqrt(a);
    while (true){
      if (b*b >= 4*a && (b-1)*(b-1) >= 4*a){
        b--;
      } else if(b*b <= 4*a && (b+1)*(b+1) <= 4*a){
        b++;
      } else {
        break;
      }
    }
    return b;
  }
  
  public static BigDecimal sqrt(BigDecimal a, int scale){
    BigDecimal x = new BigDecimal(
            Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
    if(scale < 17) return x;
    
    BigDecimal b2 = new BigDecimal(2);
    for(int tempScale = 16; tempScale < scale; tempScale *= 2){
      x = x.subtract(
              x.multiply(x).subtract(a).divide(
                      x.multiply(b2), scale, RoundingMode.HALF_EVEN));
    }
    return x;
  }
}