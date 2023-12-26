public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String x = "";
		try {
			while ((x = in.readLine()) != null) {
				if (x.equals("0 0")) break;
				String[] values = x.split(" ");
				int a = Integer.parseInt(values[0]);
				int b = Integer.parseInt(values[1]);
				for (int i = 0; i < a; i++) {
					for (int j = 0; j < b; j++) {
						if (((i + j) % 2) == 0) {
							System.out.print('#');
						} else {
							System.out.print('.');
						}
					}
					System.out.println();
				}
				System.out.println();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
