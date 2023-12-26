public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] yoho = br.readLine().toCharArray();
		char[] result = br.readLine().toCharArray();
		int count = 0;
		for (int i = 0; i < yoho.length; i++) {
			if (yoho[i] == result[i])
				count++;
		}
		System.out.println(count);
	}
}
