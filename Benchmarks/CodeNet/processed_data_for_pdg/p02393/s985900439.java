public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] split = str.split(" ",0);
			int[] number = new int[3];
			number[0] = Integer.parseInt(split[0]);
			number[1] = Integer.parseInt(split[1]);
			number[2] = Integer.parseInt(split[2]);
			Arrays.sort(number);
			System.out.println(number[0] + " " + number[1] + " " + number[2]);
		} catch (Exception e) {
			System.out.println("??¨??????");
		}
	}
}
