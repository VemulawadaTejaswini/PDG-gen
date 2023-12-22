import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int diffHeightA = sc.nextInt();
		int diffHeightB = sc.nextInt();

		int intTowerHeightA = 0;

		for(int i = 1; intTowerHeightA < diffHeightA; i++) {
			intTowerHeightA += i;
		}

		int intTowerHeightB = 0;
		for(int i = 1; intTowerHeightB < diffHeightB; i++) {
			intTowerHeightB += i;
		}

		boolean isOkFlag = true;
		int intSnowHeight = 1;
		int checkNum1 = 0;
		int checkNum2 = 0;
		while(isOkFlag) {
			checkNum1 = intTowerHeightA - intSnowHeight;
			checkNum2 = intTowerHeightB - intSnowHeight;
			if((checkNum1 == diffHeightA) && (checkNum2 == diffHeightB)) {
				isOkFlag = false;
			}
			intSnowHeight++;
		}
		System.out.println(intSnowHeight);
	}
}
