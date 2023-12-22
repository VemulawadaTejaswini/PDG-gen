import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String[] split = s.split("");
		
		if(split[2].equals(split[3])) {
			if(split[4].equals(split[5])) {
				System.out.print("Yes");
				return;
			}
		}
		System.out.print("No");
		
	}

}
