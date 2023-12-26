public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = br.readLine();
			int num = line.length();
			String x = "";
			for(int i = 0; i < num; i++){
				x += line.charAt(num - i - 1);
			}
			System.out.println(x.toString());
		} catch (Exception e) {
			System.exit(0);
		}
	}
}
