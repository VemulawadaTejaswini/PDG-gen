
import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final long W = sc.nextLong();
		long wBase = 0;

		ArrayList<ArrayList<Long>> items = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			ArrayList<Long> al = new ArrayList<>();
			items.add(al);
		}

		for (int i = 0; i < N; i++) {
			long wi = sc.nextLong();
			long vi = sc.nextLong();
			if (i == 0) {
				wBase = wi;
			}
			assert (wi - wBase > 0 && wi - wBase < 4);
			int idx = (int) (wi - wBase);
			items.get(idx).add(vi);
		}
		for (int i = 0; i < items.size(); i++) {
			Collections.sort(items.get(i), (Long a, Long b) -> (int) (b - a));
			ArrayList<Long> list = new ArrayList<Long>(items.get(i).size() + 1);
			list.add(0L);
			long sum = 0;
			for (long v : items.get(i)) {
				sum += v;
				list.add(sum);
			}
			items.set(i, list);
		}

		long maxValue = 0;
		for (int i = 0; i < items.get(0).size(); i++) {
			for (int j = 0; j < items.get(1).size(); j++) {
				for (int k = 0; k < items.get(2).size(); k++) {
					long totalW = (long) wBase * i + (long) (wBase + 1) * j + (long) (wBase + 2) * k;
					if (totalW > W) {
						break;
					}
					int l = (int) ((W - totalW) / (wBase + 3));
					long totalV = items.get(0).get(i) + items.get(1).get(j) + items.get(2).get(k)
							+ items.get(3).get(Math.min(l, items.get(3).size() - 1));
					maxValue = Math.max(maxValue, totalV);
				}
			}
		}

		System.out.println(maxValue);
		sc.close();

	}

}