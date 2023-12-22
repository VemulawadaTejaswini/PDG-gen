import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> integerList = getStrings(sc, num);
		HashMap<Integer, CalResult> map = new HashMap<Integer, CalResult>();

		long countSize = integerList.stream().distinct().count();
		int size = integerList.size();
		if (countSize == 1) {
			for (int i = 0; i < size; i++) {
				System.out.println((size - 1) * (size - 2) / 2);
			}
			return;
		} else if (countSize == size) {
			for (int i = 0; i < size; i++) {
				System.out.println(0);
			}
			return;
		}

		for (int i = 0; i < size; i++) {
			int a = integerList.get(i);
			if (!map.containsKey(a)) {
				CalResult c = new CalResult();
				c.setCount(1);
				map.put(a, c);
			} else {
				CalResult c = map.get(a);
				int b = c.getCount();
				c.setCount(b+1);
				map.put(a, c);
			}
		}

		long sumall = 0;
		for (Map.Entry<Integer, CalResult> entry : map.entrySet()) {
			CalResult c = entry.getValue();
			int count = c.getCount();

			if (count>1) {
				sumall+=(count)*(count-1)/2;
				c.setWithCount((count)*(count-1)/2);
			} else {
				c.setWithCount(0);
			}
			if (count>2) {
				c.setWithoutCount((count-1)*(count-2)/2);
			} else {
				c.setWithoutCount(0);
			}
		}

		for (int i = 0; i < size; i++) {
			long sum =0;
			sum+=map.get(integerList.get(i)).getWithoutCount();
			sum+=sumall-map.get(integerList.get(i)).getWithCount();
			System.out.println(sum);
		}

	}

	static class CalResult {
		int count;
		long withCount;
		long withoutCount;

		public CalResult() {}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public long getWithCount() {
			return withCount;
		}

		public void setWithCount(int withCount) {
			this.withCount = withCount;
		}

		public long getWithoutCount() {
			return withoutCount;
		}

		public void setWithoutCount(int withoutCount) {
			this.withoutCount = withoutCount;
		}
	}

	private static List<Integer> getStrings(Scanner sc, int num) {
		List<Integer> integerList = new ArrayList<>();
		while(num>0) {
			int i = sc.nextInt();
			integerList.add(i);
			num--;
		}
		return integerList;
	}

}
