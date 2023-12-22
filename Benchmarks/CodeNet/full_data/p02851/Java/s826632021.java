import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] arr = new long[n + 1];
		for (int i = 1; i <= n; i++) {
		    arr[i] = arr[i - 1] + sc.nextInt();
		}
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i <= n; i++) {
		    arr[i] = (arr[i] - i + k) % k;
		    int key = (int)arr[i];
		    ArrayList<Integer> list;
		    if (map.containsKey(key)) {
		        map.get(key).add(i);
		    } else {
		        list = new ArrayList<Integer>();
		        list.add(i);
		        map.put(key, list);
		    }
		}
		long count = 0;
		for (ArrayList<Integer> list : map.values()) {
		    int left = 0;
		    int right = 0;
		    for (; left < list.size(); left++) {
		        int leftIdx = list.get(left);
		        while (right + 1 < list.size() && list.get(right + 1) - leftIdx < k) {
		            right++;
		        }
		        count += right - left;
		    }
		}
		System.out.println(count);
	}
}
