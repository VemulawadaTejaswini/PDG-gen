import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //人数
		int a = stdIn.nextInt(); //電車を使うときの一人当たりの値段
		int b = stdIn.nextInt(); //タクシーを使ったときの値段
		int min = (a*n) < b ? a*n : b;
		System.out.println(min);
	}

}
