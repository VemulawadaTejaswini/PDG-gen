import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String s2 = s;
		while(true) {
			String s3 = s2.replaceAll("(01|10)*","");
			//System.out.println(s3);
			if(s2.equals(s3)) {
				break;
			}
			s2 = s3;
		}
		System.out.println(s.length()-s2.length());
	}

}
