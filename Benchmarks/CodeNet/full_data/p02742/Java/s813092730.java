import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		long h = scan.nextInt();
		long w = scan.nextInt();

		long t = h*w;

		if(t%2L==1) {
			System.out.println((t/2L)+1);
		}else {
			System.out.println(t/2L);
		}

	}

}
