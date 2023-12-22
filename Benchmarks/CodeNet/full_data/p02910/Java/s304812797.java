import java.util.Scanner;

//public class Main {
//	public static void main(String[] args) {
//		//141_A
//		Scanner sc = new Scanner(System.in);
//		String today = sc.next();
//		String[] weather = new String[3];
//		String ans ="";
//		weather[0] = "Sunny";
//		weather[1] = "Cloudy";
//		weather[2] = "Rainy";
//
//		if(today.equals(weather[0])) {
//			ans = weather[1] ;
//		} else if(today.equals(weather[1])) {
//			ans = weather[2] ;
//		} else if(today.equals(weather[2])) {
//			ans = weather[0] ;
//		}
//		System.out.println(ans);
//		// Scannerクラスのインスタンスをクローズ
//		sc.close();
//	}
//}

public class Main {
	public static void main(String[] args) {
		//141_A
		Scanner sc = new Scanner(System.in);
		String move = sc.nextLine();
		String[] moveLine = new String[100];
		moveLine = move.split("");
		boolean isFumiyasusa = false;
		String ans = "";
		for (int i = 1; i-1 < moveLine.length; i++) {
			if ((i) % 2 == 0) {
				if (moveLine[i-1].equals("L") || moveLine[i-1].equals("U") || moveLine[i-1].equals("D")) {
					isFumiyasusa = true;
				} else {
					isFumiyasusa = false;
					break;
				}
			} else {
				if (moveLine[i-1].equals("R") || moveLine[i-1].equals("U") || moveLine[i-1].equals("D")) {
					isFumiyasusa = true;
				} else {
					isFumiyasusa = false;
					break;
				}
			}
		}
		if (isFumiyasusa) {
			ans = "Yes";
		} else {
			ans = "No";
		}

		System.out.println(ans);
		// Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}