import java.util.*;

public class Main {
	
	public static class Matches {
		HashMap<Integer, Integer> matchCost;
		
		public Matches() {
			matchCost = new HashMap<Integer, Integer>();
			matchCost.put(1, 2);
			matchCost.put(2, 5);
			matchCost.put(3, 5);
			matchCost.put(4, 4);
			matchCost.put(5, 5);
			matchCost.put(6, 6);
			matchCost.put(7, 3);
			matchCost.put(8, 7);
			matchCost.put(9, 6);
		}
		
		public int getCost(int digit) {
			return matchCost.get(digit);
		}
		
		public int getLargestSingleDigit(int numMatches, int[] digits) {
			int max = 0;
			for (int i = 0; i < digits.length; i++) {
				if (matchCost.get(digits[i]) <= numMatches) {
					if (digits[i] > max) {
						max = digits[i];
					}
				}
			}
			return max;
		}
		
		public int[] removeCopies(int[] digits) {
			int[] greatestDigitWithCost = new int[8];
			for (int i = 0; i < digits.length; i++) {
				if (greatestDigitWithCost[getCost(digits[i])] < digits[i]) {
					greatestDigitWithCost[getCost(digits[i])] = digits[i];
				}
			}
			int count = 0;
			for (int i = 0; i < 8; i++) {
				if (greatestDigitWithCost[i] > 0) {
					count++;
				}
			}
			int[] newCopy = new int[count];
			count = 0;
			for (int i = 0; i < 8; i++) {
				if (greatestDigitWithCost[i] > 0) {
					newCopy[count] = greatestDigitWithCost[i];
					count++;
				}
			}
			return newCopy;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] digits = new int[M];
		int maxRepetitions = 0;
		int maxDigit = 0;
		Matches matches = new Matches();
		
		String[] possibleSums = new String[N+1];
		possibleSums[N] = "";
		
		for (int i = 0; i < M; i++) {
			digits[i] = sc.nextInt();
		}
		
		digits = matches.removeCopies(digits);
		
		Arrays.sort(digits);
		
		M = digits.length;
		
		for (int i = 0; i < M; i++) {
			possibleSums[matches.getCost(digits[i])] = Integer.toString(digits[i]);
		}
		
		for (int i = 1; i <= N; i++) {
			if (possibleSums[i] != null) {
				for (int j = 0; j < M; j++) {
					if (i + matches.getCost(digits[j]) <= N && (possibleSums[i + matches.getCost(digits[j])] == null || possibleSums[i + matches.getCost(digits[j])].length() < possibleSums[i].length()+1)) {
						possibleSums[i + matches.getCost(digits[j])] = possibleSums[i]+digits[j];
					}
				}
			}
		}
		
		char[] solution = possibleSums[N].toCharArray();;
		Arrays.sort(solution);
		for (int i = 0; i < solution.length/2; i++) {
			char temp = solution[i];
			solution[i] = solution[solution.length-1-i];
			solution[solution.length-1-i] = temp;
		}
		System.out.println(String.valueOf(solution));
	}
}
