public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] split = s.split(" ");
		int H = Integer.parseInt(split[0]);
		int W = Integer.parseInt(split[1]);
		s = sc.nextLine();
		split = s.split(" ");
		int h = Integer.parseInt(split[0]);
		int w = Integer.parseInt(split[1]);

		System.out.println((H - h) * (W - w));

		sc.close();
	}
}