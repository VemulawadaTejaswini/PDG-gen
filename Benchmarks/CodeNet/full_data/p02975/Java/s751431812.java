import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		if(N%3!=0) {
			for(int i=0; i<N; i++) {
				int a = in.nextInt();
				if(a != 0) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
			
		}else {
			int[] list = new int[3];
			int[] count = new int[3];
			list[0] = list[1] = list[2] = -1;
			for(int i=0; i<N; i++) {
				int a = in.nextInt();
				for(int j=0; j<3; j++) {
					if(list[j] == -1) {
						list[j] = a;
						count[j] ++;
						break;
					}else if(list[j] == a) {
						count[j] ++;
						break;
					}
					if(j==2) {
						System.out.println("No");
						return;
					}
				}
			}
			if(list[1] == -1 && list[0] == 0 ||
				list[2] == -1 && (list[0] == 0 && count[0] == N/3 || list[1] == 0 && count[1] == N/3) ||
				count[0]==count[1] && count[1]==count[2] && (list[0]^list[1]) == list[2]
			) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}