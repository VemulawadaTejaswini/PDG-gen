import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b= Integer.parseInt(sc.next());
		int r=1;
		while(true) {
			if(r%a==0&&r%b==0) {
				break;
			}
			r++;
		}
		System.out.println(r);
	}
}