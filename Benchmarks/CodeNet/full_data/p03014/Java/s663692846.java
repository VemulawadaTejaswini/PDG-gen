import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		char[][] map=new char[h][w];
		int[][] side=new int[h][w];
		int[][] row=new int[h][w];
		for(int i=0; i<h; i++){
			String s=sc.next();
			for(int j=0; j<w; j++){
				map[i][j]=s.charAt(j);
			}
		}
		for(int i=0; i<h; i++){
			int cou=0;
			for(int j=0; j<w; j++){
				if(map[i][j]=='.'){
					cou++;
					side[i][j]=cou;
				}else{
					cou=0;
				}
			}
			for(int k=w-1; k>=1; k--){
				if(map[i][k]=='#'){
					continue;
				}
				side[i][k-1]=side[i][k];
			}
		}
		for(int i=0; i<w; i++){
			int cou=0;
			for(int j=0; j<h; j++){
				if(map[j][i]=='.'){
					cou++;
					row[j][i]=cou;
				}else{
					cou=0;
				}
			}
			for(int k=h-1; k>=1; k--){
				if(map[k][i]=='#'){
					continue;
				}
				row[k-1][i]=row[k][i];
			}
		}
		long ans=0;
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				ans=Math.max(ans,side[i][j]+row[i][j]-1);
			}
		}
		System.out.println(ans);
	}
}
