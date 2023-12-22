public class Main {

	public static void main(String[] args) {
		if (args == null || args.length != 3) {
			return;
		}
		
		int N = Integer.parseInt(args[0]);
		int A = Integer.parseInt(args[1]);
		int B = Integer.parseInt(args[2]);
		
		System.out.println(N * A > B ? B : N * A);

	}

}
