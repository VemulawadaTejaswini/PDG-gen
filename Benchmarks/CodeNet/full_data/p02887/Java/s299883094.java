import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String slimeSequence = sc.nextLine();
		
		sc.close();
		int numOfSlime = n;
		char beforeChar = 'A';
		
		for(int i = 0; i < n ; i++) {
			char nowChar = slimeSequence.charAt(i);
			if(nowChar == beforeChar) {
				numOfSlime--;
			}
			beforeChar = nowChar;
		}
		
		System.out.println(numOfSlime);
	}

}