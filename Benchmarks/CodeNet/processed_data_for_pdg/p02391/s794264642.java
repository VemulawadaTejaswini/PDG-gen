public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] compare_array = str.split(" ");
			if (Integer.parseInt(compare_array[0]) < Integer.parseInt(compare_array[1])) {
				System.out.println("a < b");
			} else if (Integer.parseInt(compare_array[0]) > Integer.parseInt(compare_array[1])) {
				System.out.println("a > b");
			} else if (Integer.parseInt(compare_array[0]) == Integer.parseInt(compare_array[1])) {
				System.out.println("a == b");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
