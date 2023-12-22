import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		List<List<Integer>> p = new ArrayList<>();
		// List<List<Integer>> order = new ArrayList<>();

		String[] cities = new String[m];

		for (int i = 0; i < n; i++) {
			p.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			int temp = sc.nextInt() - 1;
			int temp2 = sc.nextInt();
			p.get(temp).add(temp2);
			cities[i] = String.format("%06d", temp + 1) + String.format("%06d", temp2);
		}


		HashMap<String, String> map = new HashMap<>();

		p.forEach(list -> {
			list.stream().sorted((x1, x2) -> x1 - x2).forEach(sorted -> {
				int size = p.indexOf(list) + 1;
				String s1 = String.format("%06d", size);
				String s2 = String.format("%06d", list.indexOf(sorted) + 1);
				String s =  String.format("%06d", size) + String.format("%06d", sorted);

				map.put(s, s1 + s2);
			});
		});

		for (int i = 0; i < cities.length; i++) {

			String s = map.get(cities[i]);
			System.out.println(s);
		}

		sc.close();

	}

}