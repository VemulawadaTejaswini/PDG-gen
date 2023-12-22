import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] pointInfo = new int[n][d];
		for(int i =0;i <n;i++) {
			for(int j =0;j <d;j++) {
				pointInfo[i][j] = sc.nextInt();
			}
		}
		int answer =0;
		for(int i = 0; i < n-1;i++) {
			for(int j = i +1; j < n;j++) {
				int kyori = 0;
				for(int k =0;k <d;k++) {
					kyori += (pointInfo[j][k]- pointInfo[i][k]) * (pointInfo[j][k]- pointInfo[i][k]);
				}
				int l =1;
				while(l <=16000) {
					if(l * l == kyori) {
						answer++;
						break;
					}
					l++;
				}
			}
		}
		System.out.println(answer);
	}
}