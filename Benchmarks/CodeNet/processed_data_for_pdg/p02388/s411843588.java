public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int x = Integer.parseInt(br.readLine());
			System.out.printf("%d\n",x*x*x);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
