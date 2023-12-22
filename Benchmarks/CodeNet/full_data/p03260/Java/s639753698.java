import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		if( A * B % 2 == 1){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}