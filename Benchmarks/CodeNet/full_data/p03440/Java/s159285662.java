
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int uf[] = new int[n];
		for (int i = 0; i < n; i++) {
			uf[i] = i;
		}

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			uf[uf[x]] = uf[y];
		}

		Map<Integer, List<Integer>> costs = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < n; i++) {
			List<Integer> list;
			int parent = find(uf, i);
			if (costs.containsKey(parent)) {
				list = costs.get(parent);
			} else {
				list = new LinkedList<Integer>();
			}
			list.add(a[i]);
			costs.put(parent, list);
		}

		int other[] = new int[n -m-1];
		int oi = 0;
		long res = 0;
		for (List<Integer> list : costs.values()) {

			Integer[] arr = list.toArray(new Integer[0]);
			Arrays.sort(arr);

			for(int i = 1; i < arr.length ; i++){
				other[oi] = arr[i];
				oi ++;
			}
			
			res += arr[0];
		}
		Arrays.sort(other);
		if(costs.keySet().size() == 1){
			System.out.println(0);
			return;
		}
		int size = (n-m-1);
		if(other.length > size){
			System.out.println("Impossible");
			return;
		}
		for(int i =0 ; i <  size; i++){
			res += other[i];
		}
		System.out.println(res);
		
	}


	int find(int[] uf, int i) {
		if (i != uf[i]) {
			uf[i] = find(uf, uf[i]);
		}
		return uf[i];
	}
}
