public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String [] str = bufferedReader.readLine().split(" ");
		Integer a = Integer.parseInt(str[0]);
		Integer b = Integer.parseInt(str[1]);
		if (a < b) {
			System.out.println("a < b");
		}else if (a > b) {
			System.out.println("a > b");
		}else {
			System.out.println("a == b");
		}
	}
}
