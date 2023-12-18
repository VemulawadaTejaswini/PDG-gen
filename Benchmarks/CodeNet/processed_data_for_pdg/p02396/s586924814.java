public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int inputInt = 0;
		int index = 0;
		Map<String, Integer> map = new LinkedHashMap<>();
		while((inputInt = Integer.parseInt(input.readLine())) != 0) {
			map.put("Case " + (++index) + ": ", inputInt);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
	}
}
