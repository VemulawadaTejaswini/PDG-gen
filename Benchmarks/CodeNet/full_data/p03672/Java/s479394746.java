import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		while (true){
			in = erace(in);
			if (isGumoji(in)) {
				break;
			}
		}
		System.out.println(in.length());
		sc.close();
	}

	private static String erace(String in){
		int len = in.length() - 1;
		String ret = in.substring(0, len);
		return ret;
	}

	private static boolean isGumoji(String in){
		int len = in.length();
		if (len % 2 == 0) {
			int pos = len / 2;
			String a = in.substring(0, pos);
			String b = in.substring(pos,len);
//			System.out.println(a + "," + b);
			if (a.equals(b)){
				return true;
			} else {
				return false;
			}

		}
		return false;

	}

}