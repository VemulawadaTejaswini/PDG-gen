import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt();
		int indexVal = sc.nextInt();
		
		int[] aVals = new int[tests];
		int[] bVals = new int[tests];
		
		int bSum = 0;
		
		for (int i = 0; i < tests; i++) {
			aVals[i] = sc.nextInt();
			bVals[i] = sc.nextInt();
			bSum += bVals[i];
		}
		
		HashMap<Integer, Integer> hashes = new HashMap<Integer, Integer>(tests);
		for (int i = 0; i < tests; i++) {
			hashes.put((Integer) aVals[i], (Integer) bVals[i]);
		}
		
		Arrays.sort(aVals);
		
		for (int i = 0; i < tests; i++) {
			bVals[i] = (int) hashes.get((Integer) aVals[i]);
		}
		
		int counter = 0;
		
		int finalResult = 0;
		
		for (int i = 0; i < tests; i++) {
			counter += bVals[i];
			if (counter >= indexVal) {
				finalResult = aVals[i];
				break;
			}
		}
		
		System.out.println(finalResult);
	}
}
