import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();

		HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
		PriorityQueue<Integer> tasks = new PriorityQueue<>(Comparator.reverseOrder());

		for(int i = 0; i < n; i++){
			int a = sc.nextInt(), b = sc.nextInt();
			map.computeIfAbsent(a, o -> new ArrayList<>()).add(b);
		}

		sc.close();


		//処理
		long ans = 0;

		for(int i = 1; i <= m; i++){
			ArrayList<Integer> list = map.get(i);
			if(list != null){
				for(Integer item : list) tasks.add(item);
			}
			Integer task = tasks.poll();
			if(task != null) ans += task;
		}


		//出力
		System.out.println(ans);
	}
}
