import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] bin;
		int N;
		int[] ans;
		bin = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				bin[i][j]=sc.nextInt();
			}
		}
		N=sc.nextInt();
		ans =new int[N];
		for (int i = 0; i < N; i++) {
			ans[i]=sc.nextInt();
		}

		int[][] awa;
		awa = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < N; k++) {

					if(bin[i][j]==ans[k]){
						awa[i][j]=0;
						break;
					}
					else{
						awa[i][j]=1;
					}

				}
			}
		}
		if (awa[0][0] == 0 && awa[0][1] == 0 && awa[0][2] == 0) {
			System.out.println("Yes");
		}
		else if (awa[1][0] == 0 && awa[1][1] == 0 && awa[1][2] == 0) {
			System.out.println("Yes");
		}
		else if (awa[2][0] == 0 && awa[2][1] == 0 && awa[2][2] == 0) {
			System.out.println("Yes");
		}
		else if (awa[0][0] == 0 && awa[1][0] == 0 && awa[2][0] == 0) {
			System.out.println("Yes");
		}
		else if (awa[0][1] == 0 && awa[1][1] == 0 && awa[2][1] == 0) {
			System.out.println("Yes");
		}
		else if (awa[0][2] == 0 && awa[1][2] == 0 && awa[2][2] == 0) {
			System.out.println("Yes");
		}
		else if (awa[0][0] == 0 && awa[1][1] == 0 && awa[2][2] == 0) {
				System.out.println("Yes");
		}
		else if (awa[0][2] == 0 && awa[1][1] == 0 && awa[2][0] == 0) {
				System.out.println("Yes");
		}
		else {
				System.out.println("No");

			}



		return;
		}
	}

