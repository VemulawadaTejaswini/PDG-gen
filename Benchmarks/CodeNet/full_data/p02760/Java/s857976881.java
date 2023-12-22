import java.util.Scanner;

public class Main {
	
	int[] bingoArr;
	

	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		
		bingoArr = new int[9];
		for(int i = 0; i < 9; i++) {
			bingoArr[i] = sc.nextInt();
		}
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int hole = sc.nextInt();
			
			for(int j = 0; j < 9; j++) {
				if(bingoArr[j] == hole) {
					bingoArr[j] = -1;
					break;
				}
			}
			if(checkBingo()) {
				System.out.println("Yes");
				return;
			}
		}
		sc.close();
		System.out.println("No");
		
	}
	
	public boolean checkBingo() {
		
		//　横
		if(bingoArr[0] == -1 && bingoArr[1] == -1 && bingoArr[2] == -1) {
			return true;
		}
		if(bingoArr[3] == -1 && bingoArr[4] == -1 && bingoArr[5] == -1) {
			return true;
		}
		if(bingoArr[6] == -1 && bingoArr[7] == -1 && bingoArr[8] == -1) {
			return true;
		}
		
		// 縦
		if(bingoArr[0] == -1 && bingoArr[3] == -1 && bingoArr[6] == -1) {
			return true;
		}
		
		if(bingoArr[1] == -1 && bingoArr[4] == -1 && bingoArr[7] == -1) {
			return true;
		}
		
		if(bingoArr[2] == -1 && bingoArr[5] == -1 && bingoArr[8] == -1) {
			return true;
		}
		
		// 斜め
		if(bingoArr[0] == -1 && bingoArr[4] == -1 && bingoArr[8] == -1) {
			return true;
		}
		
		if(bingoArr[2] == -1 && bingoArr[4] == -1 && bingoArr[6] == -1) {
			return true;
		}
		
		return false;
	}
}
