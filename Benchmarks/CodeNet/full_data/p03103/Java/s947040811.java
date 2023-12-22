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

		Map<Long, Long> dataMap = new TreeMap<Long, Long>();
		for(int i = 0; i < N; i ++) {
			input = sc.nextLine();
			long tmpInput[] = convertStringToArrayLong(input);
			dataMap.put(tmpInput[0], tmpInput[1]);
		}
	
		long amount = 0;
		
		for(Map.Entry<Long, Long> entry : dataMap.entrySet()) {
			if(M - (entry.getValue()) >= 0) {
				M = M -entry.getValue();
				amount = amount +(entry.getKey()*entry.getValue());
			}else {
				for(int i = 0; i < M ; i++) {
					amount = amount + entry.getKey();
					
				}
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