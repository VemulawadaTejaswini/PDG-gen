public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int henkan = Integer.parseInt(line);
		int ans = henkan * henkan * henkan;
        System.out.println(ans);
	}
}
