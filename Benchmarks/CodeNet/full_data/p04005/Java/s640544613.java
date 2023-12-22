import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<BigDecimal> numList = new ArrayList<BigDecimal>();
		Scanner sc = new Scanner(System.in);
		numList.add(sc.nextBigDecimal());
		numList.add(sc.nextBigDecimal());
		numList.add(sc.nextBigDecimal());
		sc.close();
		BigDecimal result = BigDecimal.ZERO;
		boolean isAllEven = true;
		for(BigDecimal num : numList){
			
			if(!isEven(num)){
				isAllEven = false;
				break;
			}
		}
		
		if (isAllEven){
			
			result = BigDecimal.ZERO;
		}
		else{
			
			Collections.sort(numList);
			result = numList.get(0).multiply(numList.get(1));
		}
		
		System.out.println(result);
	}

	public static boolean isEven(BigDecimal num){
		boolean result = false;
		
		if(num.remainder(new BigDecimal("2")).equals(0)){
			
			result = true;
		}
		
		return result;
	}
}
