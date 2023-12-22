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
		long sum = 0;
		for(int temp : list.keySet()) {
			int tmp = list.get(temp);
			sum+=1L*tmp*(tmp-1)/2;
		}
		for (int i = 1; i <= n; i++) {
			int temp = arr[i];
			long answer = sum - (list.get(temp)-1);
			System.out.println(answer);
		}

	}

}
