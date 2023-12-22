import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		String[][] field = new String[height][width];
		for(int i = 0;i < height;i++) {
			field[i] = sc.next().split("");
		}

		for(int i = 0;i < height;i++) {
			StringBuilder answer = new StringBuilder();
			for(int j = 0;j < width;j++) {
				if(field[i][j].equals("#")) {
					answer.append(String.valueOf("#"));
				}else {
					int bombCount = 0;
					if(i !=0 && field[i-1][j].equals("#")) {
						bombCount++;
					}
					if(i !=height-1 && field[i+1][j].equals("#")) {
						bombCount++;
					}
					if(j !=width -1 && field[i][j+1].equals("#")) {
						bombCount++;
					}
					if(j !=0 && field[i][j-1].equals("#")) {
						bombCount++;
					}
					if(i !=0 && j != width-1 && field[i-1][j +1].equals("#")) {
						bombCount++;
					}
					if(i !=0 && j != 0 && field[i-1][j-1].equals("#")) {
						bombCount++;
					}
					if(i !=height -1 && j != width-1 && field[i+1][j +1].equals("#")) {
						bombCount++;
					}
					if(i !=height -1 && j != 0 && field[i+1][j-1].equals("#")) {
						bombCount++;
					}
					answer.append(String.valueOf(bombCount));
				}
				if(j == width -1) {
					System.out.println(answer);
				}
			}
		}

	}
}