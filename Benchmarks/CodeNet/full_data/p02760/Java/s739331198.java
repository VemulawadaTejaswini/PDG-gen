import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sheet[][] = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				sheet[i][j] = sc.nextInt();
			}
		}

		int N = sc.nextInt();
		for(int n = 0; n < N; n++){
			int x = sc.nextInt();
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(sheet[i][j] == x)sheet[i][j] = 0;
				}
			}
		}

		boolean bingoFlag;

		boolean rowFlag = false;
		boolean columnFlag = false;

		for(int i = 0; i < 3; i++){
			rowFlag = true;
			columnFlag = true;
			for(int j = 0; j < 3; j++){
				if(sheet[i][j] != 0)rowFlag = false;
				if(sheet[j][i] != 0)columnFlag = false;
			}
			if(rowFlag || columnFlag)break;
		}

		bingoFlag = rowFlag || columnFlag;

		boolean rightObliqueFlag = false;
		boolean leftObliqueFlag = false;

		if(!bingoFlag){
			rightObliqueFlag = true;
			leftObliqueFlag = true;
			for(int i = 0; i < 3; i++){
				if(sheet[i][i] != 0)rightObliqueFlag = false;
				if(sheet[i][2 - i] != 0)leftObliqueFlag = false;
			}
			bingoFlag = bingoFlag || rightObliqueFlag || leftObliqueFlag;
		}

		System.out.println((bingoFlag)?"Yes":"No");
	}
}
