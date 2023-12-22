import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String Judge="";
		for(int i = 0; i<str.length();i+=2) {
			if(str.substring(i).equals("R")) {
				Judge="No";
			}

			}
		for(int j = 1; j<str.length();j+=2) {
			if(str.substring(j).equals("L")) {
				Judge="No";
			}
			else {
				Judge="Yes";
			}
		}
		System.out.println(Judge);
	}

}
