import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		
		int nokori = n-a;
		if(nokori%500==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
