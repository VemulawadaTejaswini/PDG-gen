
import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int N=sc.nextInt();
		int M=sc.nextInt();
		if(N<4){
			System.out.println(0);
			System.exit(0);
		}
		boolean[][] step=new boolean[N][N];
		for(int i=0;i<M;i++){
			int aa=sc.nextInt();
			int bb=sc.nextInt();
			int a=Math.max(aa,bb);
			int b=Math.min(aa,bb);
			step[a-1][b-1]=true;
			step[b-1][a-1]=true;
		}
		int count=0;
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(j!=i&&step[i][j]){
					for(int k=0;k<N;k++){
						if(k!=i&&k!=j&&step[j][k]){
							for(int l=0;l<N;l++){
								if(l!=i&&l!=j&&l!=k&&step[k][l])
									if(!step[l][i]){
										count++;
										step[l][i]=true;
										step[i][l]=true;
									}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}


}