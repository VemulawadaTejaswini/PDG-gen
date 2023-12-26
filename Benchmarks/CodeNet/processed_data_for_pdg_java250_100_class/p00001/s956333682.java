public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> hillsHightList = new ArrayList<>();
		try {
			while (br.ready()) {
				hillsHightList.add(Integer.valueOf(br.readLine()));
			}
		} catch (Exception e) {
		}
		Collections.sort(hillsHightList, reverseOrder());
		System.out.println(hillsHightList.get(0));
		System.out.println(hillsHightList.get(1));
		System.out.println(hillsHightList.get(2));
		System.exit(0);
	}
}
