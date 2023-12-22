public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveA();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = sc.nextInt();

		if(A<X && A + B >= X) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}