public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = 0;
		int h = 0;
		String x = "";
		try {
			x = in.readLine();
			int n = Integer.parseInt(x);
			for (int i = 0; i < n; i++) {
				String[] words = in.readLine().split(" ");
				int judge = words[0].compareTo(words[1]);
				if (judge < 0) {
					h = h + 3;
				} else if (judge == 0) {
					t++;
					h++;
				} else {
					t = t + 3;
				}
			}
			System.out.println(t + " " + h);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
