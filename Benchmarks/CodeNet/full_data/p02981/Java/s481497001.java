public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		System.out.println(Math.min(N*A, B));
	}
}