public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] abc = new int[3];
		abc[0] = sc.nextInt();
		abc[1] = sc.nextInt();
		abc[2] = sc.nextInt();
		Arrays.sort(abc);
		StringBuilder x = new StringBuilder();
		for (int i = 0; i < abc.length; i++) {
			x.append(abc[i]);
			if (i < abc.length - 1) {
				x.append(" ");
			}
		}
		String y = x.toString();
		System.out.println(y);
	}
}
