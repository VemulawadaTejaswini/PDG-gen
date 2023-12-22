import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] map = new String[h][w];
		int[][] moves = new int[h][w];
		int[][] moves2 = new int[h][w];
		for(int i=0; i<h; i++){
			map[i] = sc.next().split("");
		}

		for(int i=0; i<h; i++){
			int count = 0;
			for(int j=0; j<w; j++){
				if(map[i][j].equals(".")){
					count++;
					if(j==w-1){
						int k = j;
						while(k>=0 && map[i][k].equals(".")){
							moves[i][k] = count;
							k--;
						}
					}
				} else {
					int k = j-1;
					while(k>=0 && map[i][k].equals(".")){
						moves[i][k] = count;
						k--;
					}
					count = 0;
				}
			}
		}

		for(int i=0; i<w; i++){
			int count = 0;
			for(int j=0; j<h; j++){
				if(map[j][i].equals(".")){
					count++;
					if(j==h-1){
						int k = j;
						while(k>=0 && map[k][i].equals(".")){
							moves2[k][i] = count;
							k--;
						}
					}
				} else {
					int k = j-1;
					while(k>=0 && map[k][i].equals(".")){
						moves2[k][i] = count;
						k--;
					}
					count = 0;
				}
			}
		}
		// for(int[] move: moves){
		// 	System.out.println(Arrays.toString(move));
		// }
		// System.out.println("");
		// for(int[] move: moves2){
		// 	System.out.println(Arrays.toString(move));
		// }
		int ans = 0;
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				ans = Math.max(ans, moves[i][j]+moves2[i][j]-1);
			}
		}
		System.out.println(ans);
	}
}
