public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] v = br.readLine().split(" ");
			int[] n = {
					Integer.parseInt(v[0]),
					Integer.parseInt(v[1]),
					Integer.parseInt(v[2])
			};
			Arrays.sort(n);
			System.out.println(n[0] + " " + n[1] + " " + n[2]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
