import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] num = new int[a];
		for (int i = 0; i < a; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a; i++) {
			if (i + 1 <= num[i]) {
				map.put(i + 1, num[i]);
			}
			else {
				map.put(num[i], i + 1);
			}
		}
		System.out.println(a - map.size());
	}

	
}