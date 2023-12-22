import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();

			int[] dArray = new int[n];
			
			HashMap<Integer, Integer> distinctNums = new HashMap<>();
			
			for(int i = 0 ; i < n ; i++ ) {
				dArray[i] = sc.nextInt();
				if ( distinctNums.containsKey(dArray[i])) {
					int currentNum = distinctNums.get(dArray[i]);
					currentNum++;
					distinctNums.put(dArray[i], currentNum);
				}
				else {
					distinctNums.put(dArray[i], 1);
				}
			}
			
			Integer[] keyArray = distinctNums.keySet().toArray(new Integer[]{});
			Arrays.sort(keyArray);
			
			if ( keyArray.length == 1 ) {
				System.out.println(0);
				return;
			}
			double currentResult = 1;
			int previousNums = distinctNums.get(keyArray[0]);
			
			for(int i = 1 ; i < keyArray.length ; i++ ) {
				//System.out.println(keyArray[i]);
				
				int currentNodeNum = distinctNums.get(keyArray[i]);
				//System.out.println(keyArray[i] + ": " + currentNodeNum);
				
				currentResult = currentResult * Math.pow(previousNums, currentNodeNum);
				previousNums = currentNodeNum;
				
			}
			

			long result = (long)(currentResult % 998244353);
			System.out.println(result);
			
			
		}
	}
}