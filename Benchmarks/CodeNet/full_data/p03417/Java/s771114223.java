import java.util.Scanner;

public class Main {
	
	static int ROW = 0; 
	static int COL = 0;
	static int mas[][];
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//ROW = sc.nextInt();
		//COL = sc.nextInt();
		ROW = 314;
		COL = 1592;
		
		mas = new int[ROW][COL];
		
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				mas[i][j]=0;
			}
		}
		
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				reverce(mas,i,j);
			}
		}
		
		int count = 0;
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				if(mas[i][j] == 1){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
	
	public static void reverce(int mas[][],int row,int col){
		
		mas[row][col] = (mas[row][col]+1) %2;

		if(col!=0){
			mas[row][col-1] = (mas[row][col-1]+1) %2;
		}
		
		if(col!=COL-1){
			mas[row][col+1] = (mas[row][col+1]+1) %2;
		}
		
		if(row!=0){
			mas[row-1][col] = (mas[row-1][col]+1) %2;
			
			if(col!=0){
				mas[row-1][col-1] = (mas[row-1][col-1]+1) %2;
			}
			
			if(col!=COL-1){
				mas[row-1][col+1] = (mas[row-1][col+1]+1) %2;
			}
		}
		
		if(row!=ROW-1){
			mas[row+1][col] = (mas[row+1][col]+1) %2;
			
			if(col!=0){
				mas[row+1][col-1] = (mas[row+1][col-1]+1) %2;
			}
			
			if(col!=COL-1){
				mas[row+1][col+1] = (mas[row+1][col+1]+1) %2;
			}
		}
	}
}