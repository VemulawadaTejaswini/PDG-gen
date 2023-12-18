public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = Integer.parseInt(in.next());
		int b = Integer.parseInt(in.next());
		int area = a * b;
		int length = a * 2 + b * 2;
		System.out.println(area + " " + length);
	}
}	
