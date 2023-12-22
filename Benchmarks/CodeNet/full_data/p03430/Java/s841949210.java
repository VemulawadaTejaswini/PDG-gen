import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		char[] s = sc.nextLine().toCharArray();
		int k = sc.nextInt();
		
		
		int[][] map = new int[s.length+1][s.length+1];
		for(int i = 0; i < s.length; i++){
			for(int j = 0 ; j < s.length; j++){
				int  jj = s.length - j - 1;
				
				map[i+1][j+1] = Math.max(map[i+1][j],map[i][j+1]);
				if(s[i] == s[jj]){
					map[i+1][j+1] = Math.max(map[i+1][j+1] , map[i][j]+1);
				}
				
			}
		}
		
		System.out.println(Math.min(s.length, (map[s.length][s.length] + k*2)));
	}
}
