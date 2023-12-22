import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int W = in.nextInt();
		int H = in.nextInt();
		int[] roadsX = new int[W];
		int[] roadsY = new int[H];
		for(int i = 0;i<W;i++){
			roadsX[i] = in.nextInt();
		}
		for(int i = 0;i<H;i++){
			roadsY[i] = in.nextInt();
		}
		int[][] houses = new int[W+1][H+1];
		for(int i = 0;i<W+1;i++){
			for(int j = 0;j<H+1;j++){
				houses[i][j]=0;
			}
		}
		houses[0][0] = 1;
		long sum = 0;
		int x = -1,y= -1;
		boolean flag = true;
		while(flag){
			flag = false;
			int min = Integer.MAX_VALUE;
			for(int i =0;i<W+1;i++){
				for(int j = 0;j<H+1;j++){
					if(houses[i][j]==1){
						if(i>0 && houses[i-1][j]==0) {

							if(roadsX[i-1]<min){
								min = roadsX[i-1];
								x = i-1;
								y =j;
								flag = true;
							}
						}
						if(i<W && houses[i+1][j]==0){
						
							if(roadsX[i]<min){
								min = roadsX[i];
								x = i+1;
								y = j;
								flag = true;
							}
						}
						if(j>0 && houses[i][j-1]==0){
							if(roadsY[j-1]<min){
								min = roadsY[j-1];
								x = i;
								y = j-1;
								flag = true;
							}
						}
						if(j<H && houses[i][j+1]==0){
							if(roadsY[j]<min){
								min = roadsY[j];
								x = i;
								y = j+1;
								flag = true;
							}

						}
					}
				}
			}
			if(flag){
				houses[x][y]=1;
				sum += min;
			}
		}
		System.out.println(sum);
	}
}
