
import java.util.HashMap;
import java.util.Scanner;

 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
//		HashSet<Integer> set = new HashSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int mx1 = 0, mx2 = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
			if (i % 2 == 0 && map.get(arr[i]) > mx1)
				mx1 = map.get(arr[i]);
			if(i%2==1 && map.get(arr[i])>mx2)mx2=map.get(arr[i]);

		}

//		System.out.println(mx+" "+mx2);
		if (map.size() == 1)
			System.out.println(n / 2);
		else
			System.out.println(n - mx1 - mx2);
	}
}