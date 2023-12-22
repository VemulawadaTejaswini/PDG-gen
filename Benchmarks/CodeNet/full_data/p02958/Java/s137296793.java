import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] map = new int[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
		}
		
		if (check(map)) {
			System.out.println("YES");
			return;
		}
		
		for (int i = 0; i < map.length-1; i++) {
			for (int j = i+1; j < map.length; j++) {
				
				int tmp = map[i];
				map[i] = map[j];
				map[j] = tmp;
				
				if (check(map)) {
					System.out.println("YES");
					return;
				}
				
				map[j] = map[i];
				map[i] = tmp;
				
			}
		}
	
		System.out.println("NO");
	}
	
	static boolean check(int[] map) {
		int pre = 0;
		for (int i : map) {
			if (pre > i) {
				return false;
			}
			pre = i;
		}
		return true;
	}
	
}

