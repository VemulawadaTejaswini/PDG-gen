import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long minMovePeople = sc.nextLong();
		for (int i = 1; i < 5; i++) {
		    long current = sc.nextLong();
		    if (current < minMovePeople) { 
		        minMovePeople = current;
		    }
		}
		BigDecimal result = new BigDecimal(N).divide(new BigDecimal(minMovePeople), 0, java.math.RoundingMode.UP);
		System.out.println(result.add(new BigDecimal("4")));
	}
}