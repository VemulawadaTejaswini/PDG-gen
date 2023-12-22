import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		String str1 = sc1.next();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		sb1.append(str1);
		sb2.append(str1.toLowerCase());
		String str2 = sb2.toString();

		boolean flg = true;

		if ( str1.charAt(0) != 'A') {
			flg = false;
			//System.out.println("test1");
		}
		sb1.deleteCharAt(0);
		sb1.insert(0,"a");

		int tmp = str1.indexOf('C');

		if ( tmp < 2 | tmp > str1.length()-2) {
			flg = false;
			//System.out.println("test2");
		}
		else {
			sb1.deleteCharAt(tmp);
			sb1.insert(tmp,"c");
			tmp = str1.indexOf('C', tmp + 1);
			if ( tmp > 0) {
				flg = false;
				//System.out.println("test3");
			}
		}

		str1 = sb1.toString();

		if ( !(str1.equals(str2)) ) {
			flg = false;
			//System.out.println("test4");
		}

		//System.out.println(sb1);
		//System.out.println(sb2);

		if (flg) {
			System.out.println("AC");
		}
		else {
			System.out.println("WA");
		}

		sc1.close();
	}

}