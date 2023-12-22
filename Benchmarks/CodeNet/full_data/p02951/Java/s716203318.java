import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner sc = new Scanner(System.in);

		//入力表示
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		int use=Math.min(C, A-B);
		
		if(A-B > C) {
			System.out.println(0);
		}else {
			System.out.println(C-use);
			
		}
	}

}