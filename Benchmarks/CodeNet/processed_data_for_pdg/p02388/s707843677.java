public class Main{
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str = br.readLine();
		int input = Integer.parseInt(str);
		System.out.println(input*input*input);
	}
}
