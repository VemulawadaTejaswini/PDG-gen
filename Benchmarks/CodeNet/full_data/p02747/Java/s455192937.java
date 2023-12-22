public class Main {

	public static void main(String[] strArgs) throws Exception {
		String str = strArgs[0].replace("hi", "");
		System.out.println(str.length() > 0 ? "No" : "Yes");
	}
}
