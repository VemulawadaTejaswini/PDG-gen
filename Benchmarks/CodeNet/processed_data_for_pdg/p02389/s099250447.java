public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				int a = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ")));
				int b = Integer.valueOf(buffer.substring(buffer.indexOf(" ") + 1));
				System.out.println(a * b + " " + (a + b) * 2 );
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
