import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] k = new int[n];
		int[][] l = new int[1000][1000];
		int flag = 0;
		int[] map = new int[m];
		int count = 0;

		for (int i = 0; i < m; i++) {
			map[i] = 0;
		}

		for (int i = 0; i < n; i++) {
			k[i] = sc.nextInt();
			for (int j = 0; j < k[i] ;j++) {
				l[i][j] = sc.nextInt();
			}

		}


		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k[i]; j++) {

				for (int o = i + 1; o < n ;o++) {
					for (int p = 0; p < k[o]; p++){
						if(l[i][j] == l[o][p]){
							map[count] = l[i][j];
							count++;
							break;

						}
					}

				}
			}
		}

//		for (int i = 0; i < m;i++){
//			System.out.println(map[i]);
//		}

		for (int i = 0; i < n;i++) {
			for (int j = 0; j < k[i]; j++) {
				for (int o = 0; o < m;o++)
				if(l[i][j] == map[o]) {
					flag = 1;
				}
			}

			if (flag == 0) {
				System.out.println("NO");
				System.exit(0);
			} else {
				flag = 0;
			}
		}


		System.out.println("YES");


		sc.close();
	}


}
