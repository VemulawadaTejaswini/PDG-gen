import java.util.*;

public class Main{
		public static int n;
		public static int[] ten;
		public static boolean[][] sen;
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int m = scan.nextInt();
		ten = new int[n];
		sen = new boolean[n][n];
		for(int i=0; i<m; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			sen[a-1][b-1] = true;
			sen[b-1][a-1] = true;
		}
		int q = scan.nextInt();
		for(int i=0; i<q; i++){
			int v = scan.nextInt();
			int d = scan.nextInt();
			int c = scan.nextInt();
			cal(v-1,d,c);
		}
		for(int i=0; i<n; i++){
			System.out.println(ten[i]);
		}
	}
	public static void cal(int x, int y, int z){
		ten[x] = z;
		if(y>0){
			for(int j=0; j<n; j++){
				if(sen[x][j]==true||sen[j][x]==true){
					y--;
					ten[j] = z;
					cal(j,y,z);
					y++;
				}
			}
		} 
	}
}