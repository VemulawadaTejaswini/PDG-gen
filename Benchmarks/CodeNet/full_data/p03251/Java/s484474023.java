import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// 1行目の入力読み取り
			String inputLine = sc.nextLine();
			String[] inputLines = inputLine.split(" ");
			int xCount = Integer.parseInt(inputLines[0]);
			int yCount = Integer.parseInt(inputLines[1]);
			int maxPosX = Integer.parseInt(inputLines[2]);
			int minPosY = Integer.parseInt(inputLines[3]);
			// 2行目の入力読み取り
			inputLine = sc.nextLine();
			inputLines = inputLine.split(" ");
			if (inputLines.length != xCount) throw new Exception();
			int tmp = 0;
			for(String s : inputLines)
			{
				tmp = Integer.parseInt(s);
				if (tmp > maxPosX) maxPosX = tmp;
			}
			// 3行目の入力読み取り
			inputLine = sc.nextLine();
			inputLines = inputLine.split(" ");
			if (inputLines.length != yCount) throw new Exception();
			for(String s : inputLines)
			{
				tmp = Integer.parseInt(s);
				if (tmp < minPosY) minPosY = tmp;
			}
			// 判定
			if (maxPosX >= minPosY)
			{
				System.out.println("War");
			} else {
				System.out.println("No War");
			}
		} catch (Exception e) {
			System.out.println("input error");
		} finally {
			sc.close();
		}
	}

}