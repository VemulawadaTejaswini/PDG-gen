public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] string = line.split(" ");
		int[] is = new int[string.length];
		for (int i = 0; i < is.length; i++) {
			is[i] = Integer.parseInt(string[i]);
		}
		Arrays.sort(is);
		System.out.println(is[0] + " " + is[1] + " " + is[2]);
	}
}
