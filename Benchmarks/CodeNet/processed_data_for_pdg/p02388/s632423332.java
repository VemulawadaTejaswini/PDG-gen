public class Main {
	public static void main(String[] args) throws IOException {
		int x;
		String str;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		x = Integer.parseInt(str);
		System.out.println(x * x * x);
	}
}
