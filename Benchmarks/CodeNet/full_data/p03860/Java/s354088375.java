public class Main {

	public static void main(String[] args) {

		if (args.length == 3 && args[1].length() < 101 ) {
			if (Character.isUpperCase(args[1].charAt(0))) {
				for (int i = 0; i < args.length; i++) {
					System.out.print(args[i].charAt(0));
				}
			}
		}

	}

}