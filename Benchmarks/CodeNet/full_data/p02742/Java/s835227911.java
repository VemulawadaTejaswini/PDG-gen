public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		long H = s.nextLong();
		long W = s.nextLong();
		System.out.println((H == 1 || W == 1) ? 1: (H*W+1)/2);
	}
}