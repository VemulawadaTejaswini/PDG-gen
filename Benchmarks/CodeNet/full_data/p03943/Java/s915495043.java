import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		boolean[][] paint = new boolean[w][h];
		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			
			if(a==1){
				for(int j=0;j<x;j++){
					for(int k=0;k<h;k++){
						paint[j][k] = true;
					}
				}
			}
			else if(a==2){
				for(int j=x;j<w;j++){
					for(int k=0;k<h;k++){
						paint[j][k] = true;
					}
				}
			}
			else if(a==3){
				for(int j=0;j<w;j++){
					for(int k=0;k<y;k++){
						paint[j][k] = true;
					}
				}
			}
			else{
				for(int j=0;j<w;j++){
					for(int k=y;k<h;k++){
						paint[j][k] = true;
					}
				}
			}
		}
		
		int cnt = 0;
		for(int i=0;i<w;i++){
			for(int j=0;j<h;j++){
				if(!paint[i][j])
					cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
