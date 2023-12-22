import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Scanner;
	import java.util.TreeMap;

	public class Main{

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			Map<Integer,Integer> list = new HashMap<Integer,Integer>();

			String[] temp = scanner.nextLine().split(" ");
			int n = Integer.parseInt(temp[0]);
			int m = Integer.parseInt(temp[1]);
			int t1 = 0;
			int t2 = 0;
			for(int i = 0; i < n; i ++) {
				temp = scanner.nextLine().split(" ");
				t1 = Integer.parseInt(temp[0]);
				t2 = Integer.parseInt(temp[1]);
				if(list.containsKey(t1)) {

					t2 = list.get(t1);
					list.put(t1, t2);
				}else {
					list.put(t1, t2);
				}
			}
			TreeMap<Integer, Integer> sorted = new TreeMap<>(list);

			long ans = 0;
			int kakaku = 0;
			int kazu = 0;
			int flag = m;
			for(Entry<Integer,Integer> entry : sorted.entrySet()) {
				kakaku = entry.getKey();
				kazu = entry.getValue();

				for(int i = 0; i < kazu ; i++) {
					flag--;
					ans += kakaku;
					if(flag == 0) {
						break;
					}
				}
				if(flag == 0) {
					break;
				}
			}

			System.out.println(ans);


		}

	}
