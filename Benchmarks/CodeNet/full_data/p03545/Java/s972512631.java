import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("");
		int a = Integer.valueOf(input[0]);
		int b = Integer.valueOf(input[1]);
		int c = Integer.valueOf(input[2]);
		int d = Integer.valueOf(input[3]);
		int answer = 0;
		for(int i = 0; i < 2; i++) {
			if(i == 0) {
				answer = a + b;
			}else {
				answer = a - b;
			}
			for(int j = 0; j < 2; j++) {
				if(j == 0) {
					answer += c;
				}else {
					answer -= c;
				}
				int tmpAnswer = answer;
				for(int k = 0; k < 2; k++) {
					if(k == 0) {
						answer += d;
					}else {
						answer -= d;
					}
					if(answer == 7) {
						System.out.println(a + convert(i) + b + convert(j) + c + convert(k) + d + "=7");
						return;
					}else {
						answer = tmpAnswer;
					}
				}
			}

		}


	}

	private static String convert(int i) {
		if(i == 0) {
			return "+";
		}else {
			return "-";
		}
	}
}