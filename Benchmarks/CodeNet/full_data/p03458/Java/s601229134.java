import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[][] hopeBlack = new int[2*k][2*k];
		int[][] hopeWhite = new int[2*k][2*k];
		for(int i=0;i<n;i++) {
			int x = in.nextInt()%(2*k);
			int y = in.nextInt()%(2*k);
			if(in.next().equals("B")) hopeBlack[x][y]++;
			else hopeWhite[x][y]++;
		}
		in.close();
		int[][] sumB = new int[2*k][2*k];
		int[][] sumW = new int[2*k][2*k];
		for(int i=0;i<2*k;i++) {
			for(int j=0;j<k;j++) {
				sumB[i][0] += hopeBlack[i][j];
				sumW[i][0] += hopeWhite[i][j];
			}
			for(int j=1;j<2*k;j++) {
				sumB[i][j] = sumB[i][j-1] + hopeBlack[i][(j-1+k)%(2*k)] - hopeBlack[i][j-1];
				sumW[i][j] = sumW[i][j-1] + hopeWhite[i][(j-1+k)%(2*k)] - hopeWhite[i][j-1];
			}
		}
		int[][] sumB2 = new int[2*k][2*k];
		int[][] sumW2 = new int[2*k][2*k];
		for(int i=0;i<2*k;i++) {
			for(int j=0;j<k;j++) {
				sumB2[0][i] += sumB[j][i];
				sumW2[0][i] += sumW[j][i];
			}
			for(int j=1;j<2*k;j++) {
				sumB2[j][i] = sumB2[j-1][i] + sumB[(j-1+k)%(2*k)][i] - sumB[j-1][i];
				sumW2[j][i] = sumW2[j-1][i] + sumW[(j-1+k)%(2*k)][i] - sumW[j-1][i];
			}
		}
		int ans = 0;
		for(int i=0;i<k;i++) {
			for(int j=0;j<2*k;j++) {
				ans = Math.max(ans, sumB2[i][j]+sumB2[i+k][(j+k)%(2*k)]+sumW2[i+k][j]+sumW2[i][(j+k)%(2*k)]);
			}
		}
		System.out.println(ans);
		

	}

}
