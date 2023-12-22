import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		long tmp[] = convertStringToArrayLong(input);
		long N = tmp[0];
		long M = tmp[1];

		TreeMap<Long, Long> dataMap = new TreeMap<Long, Long>();
		for (int i = 0; i < N; i++) {
			input = sc.nextLine();
			long tmpInput[] = convertStringToArrayLong(input);
			if(dataMap.containsKey(tmpInput[0]) ){
				Long v = dataMap.get(tmpInput[0]);
				dataMap.put(tmpInput[0], tmpInput[1] + v);
				
			}
		}

		long amount = 0;

		for (Map.Entry<Long, Long> entry : dataMap.entrySet()) {
			if (M - (entry.getValue()) > 0) {
				M = M - entry.getValue();
				amount = amount + (entry.getKey() * entry.getValue());
			} else {
				amount = amount + (entry.getKey() * M);
				break;
			}
			
		}
		System.out.println(amount);
		sc.close();
	}
	
	private static long[] convertStringToArrayLong(String input) {
		return Arrays.stream(input.split(" ")).filter(s -> !s.isEmpty()).mapToLong(Long::parseLong).toArray();
	}
}