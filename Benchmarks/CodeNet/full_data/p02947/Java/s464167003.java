import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		HashMap<String, Integer> strMap = new HashMap<>();
		HashSet<String> strSet = new HashSet<>();
		long valiation = 0;
		for(int i = 0; i < n; i++) {
			String[] strArr = sc.nextLine().split("");
			Arrays.sort(strArr);
			String concatStr = "";
			for(int j = 0; j < 10; j++) {
				concatStr = concatStr.concat(strArr[j]);
			}
			if(strMap.containsKey(concatStr)) {
				valiation += strMap.get(concatStr);
				strMap.put(concatStr, new Integer(strMap.get(concatStr)) + 1);
			}else {
				strMap.put(concatStr, new Integer(1));
				strSet.add(concatStr);
			}
		}
		sc.close();		
		
		System.out.println(valiation);
	}
	
	public static long factorial(int n) {
		long result = 1;
		for(int i = 1 ; i <= n; i++) {
			result *= (long)i;
		}
		return result;
	}

}
