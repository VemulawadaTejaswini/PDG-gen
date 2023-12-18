public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf = br.readLine();
		String[] result = buf.split(" ");
		int a = Integer.parseInt(result[0]);
		int b = Integer.parseInt(result[1]);
		int area = a * b;
		int length = (a + b)*2;
		System.out.println(area + " " + length);
	}
}
