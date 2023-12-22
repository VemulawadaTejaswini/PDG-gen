import java.util.*;

public class ABC113C {

	public static void main(String[] args) {
		new ABC113C().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();

		int[] prefs = new int[M];
		int[] years = new int[M];
		Map<Integer, Integer> yearPref = new HashMap<>();
		Map<Integer, Integer> order = new HashMap<>();
		Map<Integer, String> cityNumbers = new HashMap<>();


		for (int i = 0; i < M; i++) {
			prefs[i] = sc.nextInt();
			years[i] = sc.nextInt();
			yearPref.put(years[i], prefs[i]);
		}
		
		int [] ys = years.clone();
		Arrays.sort(ys);		
		for (int i =0; i<ys.length; i++) {
			int y = ys[i];
			int p = yearPref.get(y);
			if(!order.containsKey(p)) {
				order.put(p, 0);
			}
			int ord = order.get(p) + 1;
			order.put(p, ord);
			String cityNum = 
					String.format("%06d", p) + 
					String.format("%06d", ord);
			cityNumbers.put(y, cityNum);
		}
		
		for (int i = 0; i < M; i++) {
			System.out.println(cityNumbers.get(years[i]));
		}
		sc.close();
	}

}
