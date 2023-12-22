package atcoder_141_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//		高橋君の住む町の天気は、一日ごとに晴れ(Sunny)、くもり(Cloudy)、雨(Rainy)、晴れ、くもり、雨、… と周期的に変化します。
		//
		//		今日の天気を表す文字列 
		//		S
		//		 が与えられるので、明日の天気を予測してください。

		Scanner sc = new Scanner(System.in);
		String text = sc.next();

		switch(text) {
		case "Sunny":
			System.out.println("Cloudy");
			break;
		case "Cloudy":
			System.out.println("Rainy");
			break;
		case "Rainy":
			System.out.println("Sunny");
			break;
		default:
			System.out.println("Error");
		}
	}
}
