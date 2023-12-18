public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] value = line.split(" ");
		int a = Integer.parseInt(value[0]);
		int b = Integer.parseInt(value[1]);
		System.out.println(a * b + " " + (a * 2 + b * 2));
	}
}
