import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
		long M = sc.nextInt();
		
		Map<Long, Long> map = new HashMap<Long, Long>();
		
		for(int i = 0; i < N; i++) {
			map.put(sc.nextLong(), sc.nextLong());
		}
		
		map.entrySet().stream().sorted(java.util.Map.Entry.comparingByValue());

		double count = 0;
		long honsuu = 0;
		
		test: for(int i = 0; i < N; i++) {
			for(Map.Entry<Long, Long> entry : map.entrySet()) {
				for(int j = 0; j < entry.getValue(); j++) {
					if(honsuu < M) {
						honsuu++; 
						count+=entry.getKey();
					}else{
						break test;
					}
				}
			}
		}
		BigDecimal a  = new BigDecimal(count);
		
		System.out.println(a.toPlainString());
	}
}