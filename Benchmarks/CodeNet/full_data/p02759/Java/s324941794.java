import java.math.BigDecimal;
import java.math.RoundingMode;
 
public static void main(String[] args) {
      	int N , P;
		BigDecimal P = new BigDecimal(N);
		
		P = N / 2;
		BigDecimal P = bd.setScale(0, RoundingMode.HALF_UP);
		System.out.println(P.toPlainString()); //12
	}