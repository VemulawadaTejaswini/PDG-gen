
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String[] Ss = S.split("");
		int count = 0;

		if(Ss.length == 1) {
			System.out.println(0);
		}else {
			for(int i = 0; i < Ss.length-1 ; i++) {
				if(Ss[i].equals(Ss[i+1])) {
					count++;
					if(Ss[i+1].equals("0")) {
						Ss[i+1] = "1";
					}else {
						Ss[i+1] = "0";
					}
				}
			}
			System.out.println(count);
		}

	}

}
