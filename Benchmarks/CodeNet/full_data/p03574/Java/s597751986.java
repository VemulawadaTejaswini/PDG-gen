import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			String[] S = new String[h];
			char[][] s = new char[h][w];
			int[][] ret = new int[h+2][w+2];
			
			for(int i=0;i<h;i++) {
				S[i]=sc.next();
			}
			
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					s[i][j]=S[i].charAt(j);
				}
			}
			
			
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(s[i][j]=='#') {
						ret[i+1][j+1]= -1;
						if(ret[i][j]!=-1) {
							ret[i][j]++;
						}
						if(ret[i][j+1]!=-1) {
							ret[i][j+1]++;
						}
						if(ret[i][j+2]!=-1) {
							ret[i][j+2]++;
						}
						if(ret[i+1][j]!=-1) {
							ret[i+1][j]++;
						}
						if(ret[i+1][j+2]!=-1) {
							ret[i+1][j+2]++;
						}
						if(ret[i+2][j]!=-1) {
							ret[i+2][j]++;
						}
						if(ret[i+2][j+1]!=-1) {
							ret[i+2][j+1]++;
						}
						if(ret[i+2][j+2]!=-1) {
							ret[i+2][j+2]++;
						}
						
					}
					
				}
			}
			
			
			
			for(int i=1;i<h+1;i++) {
				for(int j=1;j<w+1;j++) {
					if(ret[i][j]==-1) {
						System.out.print("#");
					}else {
						System.out.print(ret[i][j]);
					}
					
				}
				System.out.println("");
			}
			
			
			
		}	
	}