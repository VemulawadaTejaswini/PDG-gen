public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		for(int i = input.length() - 1; i >= 0; i--){
			System.out.print(input.charAt(i));
		}
		System.out.println();
	}
}
