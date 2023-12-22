
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] s = new String[n];
		boolean hanbetsu = false;
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
			if(s[i].equals("Y")) {
				hanbetsu = true;
				break;
			}
		}
		if(hanbetsu)
			System.out.print("Four");
			else
			System.out.print("Three");


	}

}
