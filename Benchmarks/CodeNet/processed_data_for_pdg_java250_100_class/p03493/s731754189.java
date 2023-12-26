public class Main {
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			char[] chrArr = br.readLine().toCharArray();
			int sum = 0;
			for (char chr : chrArr) {
				if (chr == '1') {
					sum++;
				}
			}
			System.out.println(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
