import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String line = sc.nextLine();

		int black = 0;
		int whiteInRBlack = 0;
		int white = 0;
		int blackInLWhite = 0;
		int answerR = 0;
		int answerL = 0;


		for (int i = 0; i < n; i++) {
			if (line.charAt(i) == '#')
				black++;
			if (black > 0 && line.charAt(i) == '.')
				whiteInRBlack++;
		}

		for (int i = 0; i < n; i++) {
			if (line.charAt(i) == '.')
				white++;
			if (white > 0 && line.charAt(i) == '#')
				blackInLWhite++;
		}

		if (black < whiteInRBlack)
			answerR = black;
		else
			answerR = whiteInRBlack;
		
		if (white < blackInLWhite)
			answerL = white;
		else
			answerL = blackInLWhite;
		
		if (answerR < answerL)
			System.out.println(answerR);
		else
			System.out.println(answerL);
		
		
		sc.close();
	}
}