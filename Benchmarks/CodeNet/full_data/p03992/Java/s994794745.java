
public class Mainl {
	public static void main(String[] args) {
		String str = System.console().readLine();
		String strFirst = str.substring(0, 4);
		String strLast = str.substring(4);
		str = strFirst + " " + strLast + "\n";
		System.out.print(str);
	}
}

