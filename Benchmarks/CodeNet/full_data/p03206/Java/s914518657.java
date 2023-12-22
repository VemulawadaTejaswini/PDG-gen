import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int D = sc.nextInt();		
		
		if(D ==25){
			System.out.println("Christmas");
		}else if(D==24) {
			System.out.println("Christmas Eve");
		}else if(D==23) {
			System.out.println("Christmas Eve Eve");
		}else if(D==22) {
			System.out.println("Christmas Eve Eve Eve");
		}
	
	}
}