public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String x = "";
		try {
			x = in.readLine();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] values = x.split(" ");
		int a = Integer.parseInt(values[0]);
		int b = Integer.parseInt(values[1]);
		int c = Integer.parseInt(values[2]);
		int num = 0;
		for (int i = a; i <= b; i++) {
			if ((c % i) == 0) num++;
		}
		System.out.println(num);
	}
}
