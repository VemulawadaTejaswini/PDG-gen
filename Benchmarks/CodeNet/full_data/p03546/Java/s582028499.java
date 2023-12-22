import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		AtCoder2();
	}

	public static void AtCoder2(){
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		int MP[][] = new int[10][10];
		int wall[][] = new int[H][W];
		int optMP[] = new int[10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				MP[i][j] = scanner.nextInt();
			}
		}
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				wall[i][j] = scanner.nextInt();
			}
		}
		boolean check[] = new boolean[10];
		check[1] = true;
		for(int i=0;i<10;i++){
			optMP[i] = MP[i][1];
		}
		for(int i=1;i<10;i++){
			int min = min(optMP, check);
			check[min] = true;
			for(int j=0;j<10;j++){
				if(!check[j]){
					if(optMP[j]>optMP[min]+MP[j][min]){
						optMP[j]=optMP[min]+MP[j][min];
					}
				}
			}
		}
		int ans=0;
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				if(wall[i][j]==-1){
					continue;
				}
				ans = ans + optMP[wall[i][j]];
			}
		}
		System.out.println(ans);
	}

	public static int min(int array[],boolean check[]){
		int min=-1;
		for(int i=0;i<array.length;i++){
			if(min==-1){
				if(!check[i])
					min = i;
				else{
					continue;
				}
			}
			if(!check[i] & array[min]>array[i]){
				min = i;
			}
		}
		return min;
	}
}