public class Main{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = null;
		String mStr = null;
		int count = 0;
		Map<Integer, String> map = new HashMap<>();
		while (true) {
			try {
				word = br.readLine();
				if ("-".equals(word)) {
					break;
				}
				mStr = br.readLine();
				int m = Integer.parseInt(mStr);
				for (int i = 0; i < m; i++) {
					int h = Integer.parseInt(br.readLine());
					word = word.substring(h, word.length()) + word.substring(0, h);
				}
				map.put(count, word);
				count++;
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
}
