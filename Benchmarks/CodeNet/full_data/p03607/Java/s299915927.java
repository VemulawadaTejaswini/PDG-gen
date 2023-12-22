import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int count = Integer.parseInt(in);
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			String line = sc.nextLine();
			if ( buf.toString().indexOf(line) >= 0) {
				buf = new StringBuffer(buf.toString().replaceAll(line + ",", " ").trim());
			} else {
				buf.append(line + ",");
			}

		}
		String res = buf.toString().trim();
		String[] array = res.split(",");
		if (array.length == 1 && array[0].equals("")) {
			System.out.println(0);
		} else {
			System.out.println(array.length);
		}
	}

}