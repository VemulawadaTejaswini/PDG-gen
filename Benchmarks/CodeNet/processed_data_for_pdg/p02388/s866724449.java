public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				int i = Integer.valueOf(buffer);
				System.out.println(i * i * i);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
