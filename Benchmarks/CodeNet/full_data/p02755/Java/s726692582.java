import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
  	public static void main(String[] args){
      //入力値の取得
      Scanner sc = new Scanner(System.in);
      int a_tax = sc.nextInt();
      int b_tax = sc.nextInt();
      sc.close();

      for(int i=1; i<=100; i++) {
    	  BigDecimal bd_a = BigDecimal.valueOf(i*0.08).setScale(0, RoundingMode.DOWN);
    	  BigDecimal bd_b = BigDecimal.valueOf(i*0.1).setScale(0, RoundingMode.DOWN);
    	  if (bd_a.equals(BigDecimal.valueOf(a_tax)) && bd_b.equals(BigDecimal.valueOf(b_tax))) {
    		  System.out.println(i);
    		  return;
    	  }
      }
      System.out.println("-1");
  	}
}
