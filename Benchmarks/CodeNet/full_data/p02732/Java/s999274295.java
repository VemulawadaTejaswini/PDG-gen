import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> integerList = getStrings(sc, num);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < integerList.size(); i++) {
			int a = integerList.get(i);
			if (!map.containsKey(a)) {
				map.put(a, 1);
			} else {
				int b = map.get(a);
				map.put(a, b+1);
			}
		}

		for (int i = 0; i < integerList.size(); i++) {
			int sum =0;
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getKey().equals(integerList.get(i))) {
					if (entry.getValue()>2) {
						sum += (entry.getValue()-1) * (entry.getValue()-2) /2;
					}
				} else {
					if (entry.getValue()>1) {
						sum += (entry.getValue()) * (entry.getValue()-1) /2;
					}
				}
			}
			System.out.println(sum);
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
