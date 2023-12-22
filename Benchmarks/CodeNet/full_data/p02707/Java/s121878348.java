import java.util.*;

public class Main{

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

		int m = s.nextInt();
			int arr[] = new int[m - 1];

			for (int i = 0; i < m - 1; i++) {
				arr[i] = s.nextInt();

			}


			HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

			for (int i = 0; i < m - 1; i++) {
				if (hash.containsKey(arr[i]))
					hash.put(arr[i], hash.get(arr[i]) + 1);
				else {
					hash.put(arr[i], 1);
				}

			}
		
			ArrayList<Integer> ans = new ArrayList<Integer>(hash.values());

			for (int i = 0; i < m; i++) {
			if (ans.contains(i))
				System.out.println(ans.get(i));
				else
				System.out.println(0);
			}
		}
}


