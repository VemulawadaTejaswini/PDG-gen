import java.math.BigDecimal;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int count = Integer.parseInt(sc.nextLine());
    	int oddCount = 0;
    	for(int i = 1;i<=count;i++) {
    		if(i%2 == 1) {
    			oddCount++;
    		}
    	}
    	
    	BigDecimal totalCount = new BigDecimal(count);
    	BigDecimal bigOddCount = new BigDecimal(oddCount);
    	BigDecimal answer = bigOddCount.divide(totalCount);
    	System.out.println(answer.setScale(9));
    	
    	
    }
}