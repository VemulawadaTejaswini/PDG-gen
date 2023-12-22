import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();

		int[][] map = new int[h][w];


		for (int i=0; i<h; i++){
			char[] as = scanner.next().toCharArray();
			for (int j=0; j<w; j++){
				boolean isB = (as[j]=='#');
				if(isB){
					for (int k=1; k<=j && map[i][j-k]>k; k++){
						map[i][j-k]=k;
						for(int l=1; l<=i && map[i-l][j-k]>k+l; l++){
							map[i-l][j-k]=k+l;
						}
					}
					for (int k=1; k<=i && map[i-k][j]>k; k++){
						map[i-k][j]=k;
						for (int l=1; j+l<w && map[i-k][j+l]>k+l; l++){
							map[i-k][j+l]=k+l;
						}
					}
				}else if (i==0 && j==0) map[i][j] = Integer.MAX_VALUE;
				else if (map[0][0]==Integer.MAX_VALUE) map[i][j] = Integer.MAX_VALUE;
				else if (i==0) map[i][j] = map[i][j-1]+1;
				else if (j==0) map[i][j] = map[i-1][j]+1;
				else map[i][j] = Math.min(map[i][j-1], map[i-1][j])+1;
			}
		}

		int ans = 0;

		for (int i=0; i<h; i++) for (int j=0; j<w; j++) {
			ans = Math.max(ans, map[i][j]);
		}

		System.out.println(ans);
	}
}