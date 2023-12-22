import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] map = new int[n][n];
		long count=0;
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				map[i][j]=sc.nextInt();
			}
		}
		boolean y=true;
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				for(int k = 0; k<n; k++){
					if(i!=j){
						if(map[i][k]+map[k][j]<map[i][j]){
							System.out.println(-1);
							return;
						}else if(map[i][k]+map[k][j]==map[i][j] &&( k!=i && k!=j )){
							y=false;
						}
					}
				}
				if(y){
					count+=map[i][j];
				}
				y=true;
			}
		}
		System.out.println(count/2);
	}
}