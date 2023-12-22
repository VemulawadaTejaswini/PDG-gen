import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double L = sc.nextInt();
		BigDecimal ans = BigDecimal.valueOf(L*L*L);
		BigDecimal div = BigDecimal.valueOf(27);
		ans = ans.divide(div,7,RoundingMode.HALF_UP);
		System.out.println(ans);
	}
}