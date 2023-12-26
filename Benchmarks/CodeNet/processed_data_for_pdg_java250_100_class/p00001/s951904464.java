public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Integer[] ls = new Integer[10];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 10; i++) {
			String s = in.readLine();
			ls[i] = Integer.valueOf(s);
		}
		Arrays.sort(ls, Collections.reverseOrder());
		for (int i = 0; i < 3; i++) {
			System.out.println(ls[i]);
		}
	}
}
