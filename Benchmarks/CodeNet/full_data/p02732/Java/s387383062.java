import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(bfr.readLine());
		int n = Integer.parseInt(str.nextToken());
		str = new StringTokenizer(bfr.readLine());
		int[] arr = new int[n + 1];
		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();

		for (int i = 1; i <= n; i++) {
			int temp = Integer.parseInt(str.nextToken());
			arr[i] = temp;
			if (list.containsKey(temp)) {
				list.replace(temp, list.get(temp) + 1);
			} else {
				list.put(temp, 1);
			}
		}
		HashMap<Integer, Integer> ans = new HashMap<Integer, Integer>();
		for (int i = 1; i <= n; i++) {
			int temp = arr[i];
			int answer = 0;
			if (!ans.containsKey(temp)) {
				for (int a : list.keySet()) {
					int tmp = list.get(a);
					if(a==temp)
						tmp--;
					if (tmp >= 2) {
						answer += (tmp * (tmp - 1))/2;
					}
				}
				ans.put(temp, answer);
			}
			System.out.println(ans.get(temp));
		}

	}

}
