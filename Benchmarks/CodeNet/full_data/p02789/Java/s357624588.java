import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();

		String result = "";
		if(N == M){
			result = "Yes";
		}else{
			result = "No";
		}

		System.out.println(result);
	}

}
