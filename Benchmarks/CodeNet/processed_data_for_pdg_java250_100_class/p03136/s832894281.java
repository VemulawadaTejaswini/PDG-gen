public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		long N = Long.parseLong(line);
		List<Long> ls = new ArrayList<Long>();
		line = br.readLine();
		for (String s : line.split(" ")) {
			ls.add(Long.valueOf(s));
		}
		Collections.sort(ls);
		long max = ls.get(ls.size() - 1);
		long others = 0;
		for (int i = 0; i < ls.size() - 1; i++) {
			others += ls.get(i);
		}
		if (max < others) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}	
