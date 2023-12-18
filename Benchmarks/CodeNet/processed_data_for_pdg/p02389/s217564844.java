public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] array = line.split(" ");
		int height = Integer.parseInt(array[0]);
		int base = Integer.parseInt(array[1]);
		int rectangleArea = height * base;
		int rectanglePeriphery = (height + base) * 2;
		System.out.println(rectangleArea + " " + rectanglePeriphery);
	}
}
