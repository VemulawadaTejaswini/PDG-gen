public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf = br.readLine();
		StringBuffer sb = new StringBuffer(buf);
		System.out.println(sb.reverse());
	}
}
