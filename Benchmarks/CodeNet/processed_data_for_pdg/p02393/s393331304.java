public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] n = line.split(" ");
		Arrays.sort(n);
		System.out.println(n[0] + " " + n[1] + " " + n[2]);
	}
}
