import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int nowVal = 1;
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == nowVal) {
				nowVal++;
			}else {
				ans++;
			}
		}
		
		if(ans == n) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}

}
