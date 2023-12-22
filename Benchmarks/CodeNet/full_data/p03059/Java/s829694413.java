import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in)) {
			Resolver resolver = new Resolver(sc);
			resolver.resolve();
		}
	}
	private static class Resolver
	{
		private final int a,b,t;
		private Resolver(final Scanner sc) {
			this.a = sc.nextInt();
			this.b = sc.nextInt();
			this.t = sc.nextInt();
		}
		private void resolve() {
			int k = t/a;
			System.out.println(b*k);
		}
	}
}