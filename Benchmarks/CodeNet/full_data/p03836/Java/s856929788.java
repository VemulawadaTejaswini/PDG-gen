import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		String answer = "";

		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0) {
				if(i == 2){
					answer += "LU";
				}
				for (int j = 0; j < tx - sx; j++) {
					answer += "U";
				}

				for (int j = 0; j < ty - sy; j++) {
					answer += "R";
				}

				if(i == 2){
					answer += "RD";
				}
			} else {
				if(i == 3){
					answer += "RD";
				}
				for (int j = 0; j < ty - sy; j++) {
					answer += "D";
				}

				for (int j = 0; j < tx - sx; j++) {
					answer += "L";
				}
				if(i == 3){
					answer += "LU";
				}
			}
		}

		System.out.println(answer);
	}
}
