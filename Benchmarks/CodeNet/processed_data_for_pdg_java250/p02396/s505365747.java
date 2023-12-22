public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			int i = 0;
			while ((str = in.readLine()) != null) {
				if (str.equals("0")) break;
				i++;
				System.out.println("Case " + i + ": " + str);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
