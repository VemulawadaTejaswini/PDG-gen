public class Main {

	public static void main(String[] args) {
		final String consta = "red";
		boolean out = false;
		for (int i = 0;;i++) {
			try {
			if (i % 2 == 0) {
				out = Integer.valueOf(args[i]) >= 3200;
				continue;
			} else {
				System.out.println(out ? args[i]:consta);
			}
			} catch (Throwable th){
				return;
			}
		}

	}

}
