public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] array = input.toCharArray();
		array[3]++;
		System.out.println(array);
	}
}
