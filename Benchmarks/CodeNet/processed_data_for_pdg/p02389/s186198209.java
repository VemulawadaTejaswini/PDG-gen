public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] split = str.split(" ",0);
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			System.out.println(a * b + " " + 2 * (a + b));
		} catch (Exception e) {
			System.out.println("??¨??????");
		}
	}
}
