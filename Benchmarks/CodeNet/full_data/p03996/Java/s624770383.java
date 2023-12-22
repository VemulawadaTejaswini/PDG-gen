import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		
		int[] as = new int[q];

		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		set.add(1);

		for (int i = 1; i <= m; i++) {
			map.put(i, 0);
		}
		
		for (int i = 0; i < q; i++) {
			as[i] = sc.nextInt();
		}
		
		int j = 0;
		while(j < q){
			if(is(as, j, m)){
				j += m;
				continue;
			}
			int a = as[j];
			int curr = map.get(a);
			if (curr == n - 1) {
				map.put(a, 0);
				set.add(a);
			} else {
				map.put(a, curr + 1);
			}
			j++;
		}
		
		for (int i = 1; i <= m; i++) {
			if (map.get(i) > 0 && !set.contains(i)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	public static boolean is(int[] as, int j, int m){
		if (j + m > as.length)
			return false;
		Set<Integer> set = new HashSet<>();
		for (int i = j ; i < j+m; i++){
			if (set.contains(as[i])){
				return false;
			} else {
				set.add(as[i]);
			}
		}
		return true;
	}
}