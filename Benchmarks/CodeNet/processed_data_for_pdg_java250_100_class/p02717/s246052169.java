public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp = br.readLine().split(" ");
		sb.append(temp[2]).append(" ").append(temp[0]).append(" ").append(temp[1]);
		System.out.println(sb.toString());
	}
}
