public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuffer sb = new StringBuffer(br.readLine());
			System.out.println(sb.reverse().toString());
		} finally {
			br.close();
		}
	}
}
