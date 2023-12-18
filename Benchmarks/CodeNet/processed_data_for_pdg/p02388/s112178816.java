public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			System.out.println(x * x * x);
		} catch(InputMismatchException ex) {
			ex.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
