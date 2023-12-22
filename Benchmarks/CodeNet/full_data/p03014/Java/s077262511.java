import java.util.*;
import java.io.*;

public class Main{

	static int H;
	static int W;
	static String[][] S;

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
			for(int x = 0;x < W;x++){
			
				if(ans < ValueOfXY(x,y)){
					ans = ValueOfXY(x,y);
				}
			}
		}
		
		System.out.println(ans);
	}

	static int ValueOfXY(int x,int y){
		if(S[y][x].equals("#")){
			return 0;
		}

		int ValueX = 0;
		int ValueY = 0;
		for(int i = x;i < W && S[y][i].equals(".");i++){
			ValueX++;
		}
		for(int i = x;i >= 0 && S[y][i].equals(".");i--){
			ValueX++;
		}

		for(int j = y;j < H && S[j][x].equals(".");j++){
			ValueY++;
		}
		for(int j = y;j >= 0 && S[j][x].equals(".");j--){
			ValueY++;
		}
		
		return ValueX + ValueY - 3;
	}
}