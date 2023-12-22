import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=0;
		if(a%2==0) {
			c=a/2;
		}
		else {
			c=a/2+1;
		}
		if(c>=b) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
