import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Main{
	public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int l = scn.nextInt();
      long answer = (l/3)*(l/3)*(l/3);
      BigDecimal bd = new BigDecimal(answer);
      System.out.println(bd.setScale(12, RoundingMode.HALF_UP));
	}
}