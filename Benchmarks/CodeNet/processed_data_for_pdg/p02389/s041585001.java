public class Main {
	public static void main(String[] args) throws IOException {
		int a, b;
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		String[] line = str.split(" ");
		a = Integer.parseInt(line[0]);
		b = Integer.parseInt(line[1]);
		System.out.println(a * b + " " + (a + b) * 2);
	}
}
