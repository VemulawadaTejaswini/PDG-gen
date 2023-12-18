public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String x = "";
		try {
			x = in.readLine();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] ab = x.split(" ");
		int[] a = new int[3];
		a[0] = Integer.parseInt(ab[0]);
		a[1] = Integer.parseInt(ab[1]);
		a[2] = Integer.parseInt(ab[2]);
		Arrays.sort(a);
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
	}
}
