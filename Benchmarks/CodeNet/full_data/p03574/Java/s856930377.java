import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String HW = scan.nextLine();
		String HandW[] = HW.split(" ");
		int H = Integer.parseInt(HandW[0]);  //高さ
		int W = Integer.parseInt(HandW[1]);  //幅
		
		String array[][] = new String[H][W];

		int i,j;
		String out[] = new String[H];
		for(int line = 0; line < H; line++) {
			String s = scan.nextLine();
			if(s.length() < W || s.length() > W)
				return;
			String width[] = s.split("");
			for(i = 0; i < W; i++){
				if(!(width[i].equals(".")) || !(width[i].equals("#")) || !(width[i].equals("\n")))
					return;
				array[line][i] = width[i];
			}
		}
		int sum = 0;
		for(i = 0; i < H; i++){
			for(j = 0; j < W; j++){
				if(array[i][j].equals("#")){
					continue;
				}
				
				if(i == 0 && j == 0){
					if(array[i][j+1].equals("#"))
						sum++;
					if(array[i+1][j+1].equals("#"))
						sum++;
					if(array[i+1][j].equals("#"))  //下
						sum++;
				}
				else if(i == 0 && j == W-1){
					if(array[i][j-1].equals("#"))  //左
						sum++;
					if(array[i+1][j-1].equals("#")) //左下
						sum++;
					if(array[i+1][j].equals("#"))  //下
						sum++;
				}
				else if(i == H-1 && j == 0){
					if(array[i-1][j].equals("#"))  //上
						sum++;
					if(array[i-1][j+1].equals("#"))  //右上
						sum++;
					if(array[i][j+1].equals("#"))  //右
						sum++;
				}
				else if(i == H-1 && j == W-1){
					if(array[i-1][j].equals("#"))  //上
						sum++;
					if(array[i-1][j-1].equals("#"))  //左上
						sum++;
					if(array[i][j-1].equals("#"))  //左
						sum++;
				}
				else if(i == 0){
					if(array[i][j-1].equals("#"))  //左
						sum++;
					if(array[i][j+1].equals("#"))  //右
						sum++;
					if(array[i+1][j-1].equals("#")) //左下
						sum++;
					if(array[i+1][j].equals("#"))  //下
						sum++;
					if(array[i+1][j+1].equals("#"))  //右下
						sum++;
				}
				else if(i == H-1){
					if(array[i-1][j-1].equals("#"))  //左上
						sum++;
					if(array[i-1][j].equals("#"))  //上
						sum++;
					if(array[i-1][j+1].equals("#"))  //右上
						sum++;
					if(array[i][j-1].equals("#"))  //左
						sum++;
					if(array[i][j+1].equals("#"))  //右
						sum++;
				}
				else if(j == 0){
					if(array[i-1][j].equals("#"))  //上
						sum++;
					if(array[i-1][j+1].equals("#"))  //右上
						sum++;
					if(array[i][j+1].equals("#"))  //右
						sum++;
					if(array[i+1][j].equals("#"))  //下
						sum++;
					if(array[i+1][j+1].equals("#"))  //右下
						sum++;
				}
				else if(j == W-1){
					if(array[i-1][j-1].equals("#"))  //左上
						sum++;
					if(array[i-1][j].equals("#"))  //上
						sum++;
					if(array[i][j-1].equals("#"))  //左
						sum++;
					if(array[i+1][j-1].equals("#")) //左下
						sum++;
					if(array[i+1][j].equals("#"))  //下
						sum++;
				}
				else{
					if(array[i-1][j-1].equals("#"))  //左上
						sum++;
				
					if(array[i-1][j].equals("#"))  //上
						sum++;
				
					if(array[i-1][j+1].equals("#"))  //右上
						sum++;
				
					if(array[i][j-1].equals("#"))  //左
						sum++;
				
					if(array[i][j+1].equals("#"))  //右
						sum++;
				
					if(array[i+1][j-1].equals("#")) //左下
						sum++;
				
					if(array[i+1][j].equals("#"))  //下
						sum++;
				
					if(array[i+1][j+1].equals("#"))  //右下
						sum++;
				}
				
				array[i][j] = String.valueOf(sum);
				sum = 0;
			}
		}
		
		System.out.println("");
		
		for(i = 0; i < H; i++){
			for(j = 0; j < W; j++){
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}

	}

}