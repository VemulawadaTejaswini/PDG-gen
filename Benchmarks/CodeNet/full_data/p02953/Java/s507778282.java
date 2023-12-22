import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] heightStrArr = sc.nextLine().split(" ");
		sc.close();
		int[] heightArr = new int[n];
		for(int i = 0; i < n; i++) {
			heightArr[i] = Integer.parseInt(heightStrArr[i]);
		}
		
		
		if(heightArr[0] > 0) {
			heightArr[0] = heightArr[0] - 1;
		}
		for(int i = 1; i < n; i++) {
			if(heightArr[i] > heightArr[i-1]) {
				heightArr[i] = heightArr[i] - 1;
			}
			if(heightArr[i] < heightArr[i-1]) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
	}
}