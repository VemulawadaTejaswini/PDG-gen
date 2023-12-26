public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String info = br.readLine();
		String[] fight = info.split(" ");
		int strikes = (int) Math.ceil((Double.parseDouble(fight[0])/Double.parseDouble(fight[1])));
		System.out.println(strikes);
	}
}
