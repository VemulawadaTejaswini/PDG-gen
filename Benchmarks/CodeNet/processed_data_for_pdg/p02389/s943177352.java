public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		String[] split = line.split(" ");
		int x = Integer.parseInt(split[0]);
		int y = Integer.parseInt(split[1]);
		int area = x * y;
		int circumference = x * 2 + y * 2;
		System.out.println(area + " " + circumference);
	}
}
