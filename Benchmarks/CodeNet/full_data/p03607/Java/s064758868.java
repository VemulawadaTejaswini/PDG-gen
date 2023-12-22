import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		Map<Integer,Boolean> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (map.containsKey(num)) {
				if (map.get(num)) {
					map.replace(num, false);
					count--;
				} else {
					map.replace(num, true);
					count++;
				}
			} else {
				map.put(num, true);
				count++;
			}
		}
		System.out.println(count);
	}
}