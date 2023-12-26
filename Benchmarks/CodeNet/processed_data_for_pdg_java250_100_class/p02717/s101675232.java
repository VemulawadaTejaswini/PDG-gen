public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("A", x);
		map.put("B", y);
		map.put("C", z);
		int a = map.get("A");
		int b = map.get("B");
		map.put("A", b);
		map.put("B", a);
		int a2 = map.get("A");
		int c = map.get("C");
		map.put("A", c);
		map.put("C", a2);
		for (Integer num : map.values()) {
			System.out.print(num + " ");
		}
		sc.close();
	}
}
