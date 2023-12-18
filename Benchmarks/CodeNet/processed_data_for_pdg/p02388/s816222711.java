public class Main {
	public static void main(String[] a) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x;
		try {
			x = Integer.parseInt(br.readLine());
			System.out.println(String.valueOf(x*x*x));
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}
}
