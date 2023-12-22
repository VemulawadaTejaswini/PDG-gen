import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int n_likes = sc.nextInt();
			for(int j=0; j<n_likes; j++) {
				int food = sc.nextInt();
				count.merge(food, 1, Integer::sum);
			}
		}
		sc.close();
		int max = 0;
		int ans = -1;
		for(int key : count.keySet()) {
			if(count.get(key) > max) {
				max = count.get(key);
				ans = key;
			}
		}
		System.out.print(ans);
	}

}