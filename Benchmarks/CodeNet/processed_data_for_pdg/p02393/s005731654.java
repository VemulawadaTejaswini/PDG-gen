public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] array = line.split(" ");
		Arrays.sort(array);
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
	}
}
