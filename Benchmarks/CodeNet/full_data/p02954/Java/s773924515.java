import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		char line[];
		String workLine[] = sc.nextLine().split("");
		int squares[] = new int[workLine.length];
		Arrays.fill(squares , 0);

		for(int j = 0;j < workLine.length; j++) {
			int moveCnt = 0;

			String startDirection = workLine[j];
			int directionPoint = startDirection.equals("R") ? 1 : -1;
			int currentPoint = j;

			while(true) {
				currentPoint += directionPoint;
				moveCnt++;

				if(!workLine[currentPoint].equals(startDirection)) {
					break;
				}
			}

			if(moveCnt % 2 == 1) {
				currentPoint += (directionPoint * -1);
			}
			squares[currentPoint]++;

		}

		StringBuffer sb = new StringBuffer();
		for(int x : squares) {
			sb.append(x).append(" ");
		}
		sb.setLength(sb.length()-1);

		System.out.println(sb.toString());
	}
}