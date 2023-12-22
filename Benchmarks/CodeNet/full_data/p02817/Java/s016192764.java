import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String[] all = text.split(" ");
		String ans = "";
		for(int i = 1; i >= 0; i--){
			ans += all[i];
		}
		System.out.println(ans);
	}

}
