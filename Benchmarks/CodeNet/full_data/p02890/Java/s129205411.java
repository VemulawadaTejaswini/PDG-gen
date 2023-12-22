import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (map.containsKey(x)) {
		        map.put(x, map.get(x) + 1);
		    } else {
		        map.put(x, 1);
		    }
		}
		int length = map.size();
		int[] arr = new int[length];
		int idx = 0;
		for (int x : map.values()) {
		    arr[idx] = x;
		    idx++;
		}
		Arrays.sort(arr);
		for (int i = 1; i < length; i++) {
		    arr[i] += arr[i - 1];
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
		    if (length < i) {
		        sb.append(0);
		    } else {
		        sb.append(Math.min(n / i, arr[length - i]));
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
}
