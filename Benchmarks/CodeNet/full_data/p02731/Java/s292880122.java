import java.util.*;
import java.math.BigDecimal;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int L=sc.nextInt();
    float M=L/3;
    float m=M*M*M;
    String X = BigDecimal.valueOf(m).toPlainString();
    System.out.println(X);
  }
}