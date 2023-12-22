import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int a= stdin.nextInt();
		int b =stdin.nextInt();
		int k= stdin.nextInt();
		if(b-a<=2*k) {
			for(int i = a;i<b+1;i++) {
				System.out.println(i);
			}
		}else {
			for(int i = a;i<k;i++) {
				System.out.println(i);
			}
			for(int j = b-k;j<k+1;j++) {
				System.out.println(j);
			}
		}

		

	}

}