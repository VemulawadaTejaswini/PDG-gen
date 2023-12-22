import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int sum = 0;
		int a = 0;
		int b = 0;
		boolean finish = false;
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i + 1; j < s.length(); j++) {
				for(int k = i; k <= j; k++) {
					if(s.substring(i, i + 1).equals(s.substring(k, k + 1))) {
						sum++;
					}
				}
				if(sum > (s.substring(i, j + 1).length() / 2)) {
					a = i + 1;
					b = j + 1;
					finish = true;
					break;
				}
				sum = 0;
			}
			if(finish) {
				break;
			}
		}
		
		if(finish) {
			System.out.println(a + " " + b);
		} else {
			System.out.println("-1 -1");
		}
		
		scan.close();
	}

}
