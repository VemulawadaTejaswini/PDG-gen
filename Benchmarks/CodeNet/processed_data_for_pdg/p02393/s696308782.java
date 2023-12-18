public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] ss = line.split(" ");
		int[] num = new int[ss.length];
		for (int i = 0; i < ss.length; i++) {
			num[i] = Integer.parseInt(ss[i]);
		}
		Arrays.sort(num);
		System.out.println(num[0] + " " + num[1] + " " + num[2]);
	}
}
