import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] col = {399,799,1199,1599,1999,2399,2799,3199};
		int[] colFlag = {0,0,0,0,0,0,0,0};
		int defCol = 0;
		int freeCol = 0;
		for(int i=0;i<N;i++){
			int temp = sc.nextInt();
			if(3200<=temp){
				freeCol++;
			}else{
				for(int j=0;j<col.length;j++){
					if(temp<=col[j]){
						if(colFlag[j]==0){
							defCol++;
							colFlag[j] = 1;
						}
						break;
					}
				}
			}
		}
		System.out.println((defCol!=0?defCol:1)+" "+((defCol+freeCol<=8)?(defCol+freeCol):8));
	}
}
