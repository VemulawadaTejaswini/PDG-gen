import java.util.*;

public class Main {

public static final int[] PRIME = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[PRIME.length];
		for (int i = 1; i <= n; i++) {
			int target = i;
			int j = 0;
			while (j < PRIME.length && PRIME[j] <= target) {
				if (target % PRIME[j] == 0) {
					arr[j]++;
					target /= PRIME[j];
				} else {
					j++;
				}
			}
		
		}
		int count = 0;
		
		//4,4,2
		for (int i = 0; i < PRIME.length; i++) {
			if (arr[i] >= 4) {
				for (int j = i + 1; j < PRIME.length; j++) {
					if (arr[j] >= 4) {
						for (int k = 0; k < PRIME.length; k++) {
							if (arr[k] >=2 && k != i && k != j) {
								count++;
							}
						}
					}
				}
			}
		}
		
		//14, 4
		for (int i = 0; i < PRIME.length; i++) {
			if (arr[i] >= 14) {
				for (int j = 0; j < PRIME.length; j++) {
					if (arr[j] >= 4 && j != i) {
						count++;
					}
				}
			}
		}
		
		// 24, 2
		for (int i = 0; i < PRIME.length; i++) {
			if (arr[i] >= 24) {
				for (int j = 0; j < PRIME.length; j++) {
					if (arr[j] >= 2 && j != i) {
						count++;
					}
				}
			}
		}
		
		// 74
		for (int i = 0; i < PRIME.length; i++) {
			if (arr[i] >= 74) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
}