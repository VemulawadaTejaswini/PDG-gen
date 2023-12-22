import java.util.*;
import java.math.BigDecimal;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int L=sc.nextInt();
    int M=L*L*L;
    double m=M/27;
    String X = BigDecimal.valueOf(m).toPlainString();
    System.out.println(X);
  }
}