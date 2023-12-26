public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String x = "";
		try {
			x = in.readLine();
			int num = Integer.parseInt(x);
			x = in.readLine();
			String[] values = x.split(" ");
			int value = Integer.parseInt(values[0]);
			int min = value;
			int max = value;
			long sum = value;
			for (int i = 1; i < num; i++) {
				value = Integer.parseInt(values[i]);
				if (min > value) min = value;
				if (max < value) max = value;
				sum = sum + value;
			}
			System.out.println(min + " " + max + " " + sum);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
