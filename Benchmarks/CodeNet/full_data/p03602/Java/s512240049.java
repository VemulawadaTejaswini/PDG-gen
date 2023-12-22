import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[][] map=new long[n][n];
		long ans=0;
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				map[i][j]= sc.nextLong();
			}
		}
		boolean[][] mapb=new boolean[n][n];
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				for(int k = 0; k<n; k++){
					if(i!=j && i!=k && j!=k){
						if(map[k][j]>map[k][i]+map[i][j]){
							System.out.println("-1");
							return;
						}else if(map[k][j]==map[k][i]+map[i][j]){
							mapb[k][j]=true;
						}
					}
				}
			}
		}
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				if(!mapb[i][j]){
					ans+=map[i][j];
				}
			}
		}
		System.out.println(ans/2);
	}
}
