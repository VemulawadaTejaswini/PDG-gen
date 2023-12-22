import java.util.*;
import java.io.*;

public class Main{

	static int H;
	static int W;
	static String[][] S;
	static int temp = 0;;

	public static void main(String[] args){

		Scanner stdIn = new Scanner(System.in);
		H = stdIn.nextInt();
		W = stdIn.nextInt();

		String[] str = new String[H];
		for(int y = 0;y < H;y++){
			str[y] = stdIn.next();
		}
		
		//String[][] S = new String[H][W];
		S = new String[H][W];

		for(int y = 0;y < H;y++){
			S[y] = str[y].split("");
		}
		
		//////////////////////
		int ans = 0;
		for(int y = 0;y < H;y++){
			temp = 0;
			for(int x = 0;x < W;x++){
				//System.out.println(ValueOfXY(x,y));
				if(ans < ValueOfXY(x,y)){
					ans = ValueOfXY(x,y);
				}
			}
		}
		
		System.out.println(ans);
	}

	static int ValueOfXY(int x,int y){
		if(S[y][x].equals("#")){
			temp = 0;
			return 0;
		}

		int ValueX = 0;
		int ValueY = 0;
		if(temp == 0){
			for(int i = x;i < W && S[y][i].equals(".");i++){
				ValueX++;
			}
			for(int i = x;i >= 0 && S[y][i].equals(".");i--){
				ValueX++;
			}
			ValueX--;
			temp = ValueX;
		}
		else{
			ValueX = temp;
		}

		for(int j = y;j < H && S[j][x].equals(".");j++){
			ValueY++;
		}
		for(int j = y;j >= 0 && S[j][x].equals(".");j--){
			ValueY++;
		}
		ValueY--;

		
		return ValueX + ValueY - 1;
	}
}