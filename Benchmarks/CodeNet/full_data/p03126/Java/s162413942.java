import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int[] favs = new int[m];
		int answer = 0;
		for(int i=0; i<n; i++) {
			int k = Integer.parseInt(sc.next());
			for(int j=0; j<k; j++) {
				int fav = Integer.parseInt(sc.next());
				favs[fav-1]++;
				if(favs[fav-1] >= n) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
