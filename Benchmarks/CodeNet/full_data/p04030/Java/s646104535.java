import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();

		//System.out.println(s);
		StringBuilder ss = new StringBuilder("");

		int nagasa = s.length();
		int a = 0;
		int i = 0;
		int b=ss.length();

		for (i = 0; i < nagasa; i++) {

			char c1 = s.charAt(i);
			String str = String.valueOf(c1);

			if (str.equals("1")) {

				ss = ss.append("1");

			}else if (str.equals("0")) {

				ss = ss.append("0");

			}else if (str.equals("B")) {

				if(ss.length()==0) {

				}else {
					ss = ss.deleteCharAt(ss.length()-1);

				}
			}
			//System.out.println(ss);
		}

		System.out.println(ss);

	}

}