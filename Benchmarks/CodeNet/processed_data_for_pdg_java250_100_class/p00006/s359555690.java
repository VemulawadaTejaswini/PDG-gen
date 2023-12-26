public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = input.readLine();
			StringBuffer str = new StringBuffer(s);
			s = str.reverse().toString();
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
