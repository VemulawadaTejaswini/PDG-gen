import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		BigDecimal sum = BigDecimal.ZERO;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0; i < n; i++)
			map.put(sc.nextInt(), sc.nextInt());
		
		List<Entry<Integer, Integer>> list = map.entrySet().stream()
				.sorted(Comparator.comparingInt(entry -> entry.getKey()))
				.collect(Collectors.toList());
		
		for(Entry<Integer, Integer> entry : list) {
			if(m == 0)
				break;
			
			BigDecimal value = BigDecimal.valueOf(entry.getKey());
			BigDecimal num = BigDecimal.valueOf(entry.getValue());

			if(m > entry.getValue()) {
				m-= entry.getValue();
				sum = sum.add(value.multiply(num));
			}else if(m <= entry.getValue()) {
				num = BigDecimal.valueOf(m);
				BigDecimal b = value.multiply(num);
				sum = sum.add(b);
				
				m = 0;
			}
		}
		
		System.out.println(sum.toString());
	}
}