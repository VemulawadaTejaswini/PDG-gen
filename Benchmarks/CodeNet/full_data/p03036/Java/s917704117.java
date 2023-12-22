import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputs = sc.nextLine().split(" ", 0);
		int r = Integer.parseInt(inputs[0]);
		int D = Integer.parseInt(inputs[1]);
		int x = Integer.parseInt(inputs[2]);
		for(int i = 0; i < 10; i++) {
			x = r * x - D;
			System.out.println(x);
		}
	}
}