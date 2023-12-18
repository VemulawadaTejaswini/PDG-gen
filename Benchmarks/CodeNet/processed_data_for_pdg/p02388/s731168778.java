public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int x = Integer.parseInt(br.readLine());
			int answer = x*x*x;
			System.out.println(answer);
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}
}
