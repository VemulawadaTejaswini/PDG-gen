public class Main {
	static int time;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		Arrays.sort(s);
		System.out.println(s[0] + " " + s[1] + " " + s[2]);
	}
}
