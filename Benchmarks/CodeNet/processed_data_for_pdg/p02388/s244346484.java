public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                try {
			int num = Integer.parseInt(new String(in.readLine()));
			System.out.println(num * num * num);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
