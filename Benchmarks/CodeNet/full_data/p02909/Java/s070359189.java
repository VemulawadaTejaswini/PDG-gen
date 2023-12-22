import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//141_A
		Scanner sc = new Scanner(System.in);
		String today = sc.next();
		String[] weather = new String[3];
		String ans ="";
		weather[0] = "Sunny";
		weather[1] = "Cloudy";
		weather[2] = "Rainy";

		if(today.equals(weather[0])) {
			ans = weather[1] ;
		} else if(today.equals(weather[1])) {
			ans = weather[2] ;
		} else if(today.equals(weather[2])) {
			ans = weather[0] ;
		}
		System.out.println(ans);
		// Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
