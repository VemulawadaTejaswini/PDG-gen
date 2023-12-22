public class Hoge {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(shorten(in.readLine()));

	}

	static String shorten(String src) {
		return src.replaceAll("([A-Z])[a-z]* ([A-Z])[a-z]* ([A-Z])[a-z]*", "$1$2$3");
	}
}