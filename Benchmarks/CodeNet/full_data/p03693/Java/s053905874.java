import java.util.*;

public class Main{ // Main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		/*int[] a = new int[n];
		for(int i = 0; i < n; i ++) {
			a[i] = scanner.nextInt();
		}*/
		Set<Integer> fixed = new HashSet<>();
		int free = 0;
		for(int i = 0; i < n; i ++) {
			int a = scanner.nextInt();
			if(a / 400 < 8) {
				fixed.add(a / 400);
			} else {
				free ++;
			}
		}
		if(fixed.isEmpty()) {
			System.out.println(1 + " " + free);
		} else {
			int min = fixed.size();
			int max = min + free;		
			System.out.println(min + " " + max);
		}	
		scanner.close();
	}
}