import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		BigDecimal A=new BigDecimal(sc.next());
		BigDecimal B=new BigDecimal(sc.next());
		BigDecimal aTaxlate=new BigDecimal(0.08);
		BigDecimal bTaxlate=new BigDecimal(0.1);
		
	
		
		BigDecimal hati=A.divide(aTaxlate,0,RoundingMode.HALF_DOWN);
		BigDecimal zyu=B.divide(bTaxlate,0,RoundingMode.HALF_DOWN);
		BigDecimal zyu1=hati.multiply(bTaxlate);
		BigDecimal zyu2=zyu1.setScale(0,RoundingMode.DOWN);
		
		
		if(zyu2.equals(A)) {
			System.out.println(hati);
		}else if(hati.equals(zyu)){
			System.out.println(hati);
		}else {
			System.out.println(-1);
		}
	}

}
