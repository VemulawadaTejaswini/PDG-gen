public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int henkan = Integer.parseInt(line);
		int hour = henkan / 3600;
		int minute = henkan % 3600 / 60;
		int second = henkan % 3600 % 60;
		System.out.println(hour + ":" + minute + ":" + second);
	}
}
