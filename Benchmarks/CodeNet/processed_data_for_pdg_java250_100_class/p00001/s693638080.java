public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int heights[] = new int[10];
		for (int i = 0; i < 10; i++) {
			heights[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(heights);
		for (int i = 9; i >= 7; i--) {
			System.out.println(heights[i]);
		}
	}
}
