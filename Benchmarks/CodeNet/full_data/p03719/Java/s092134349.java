import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();

		if(c>=a&&c<=b){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
