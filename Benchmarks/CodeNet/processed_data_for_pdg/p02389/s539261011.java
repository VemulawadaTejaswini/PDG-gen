public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		long h = Long.parseLong(strArr[0]);
		long w = Long.parseLong(strArr[1]);
		long surface = h * w;
		long length = (h + w) << 1;
		System.out.printf("%d %d%n", surface, length);
	}
}
