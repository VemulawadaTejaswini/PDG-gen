import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int[][] bingo = new int[3][3];
		for(int i = 0; i < 3; i++){
		    for(int j = 0; j < 3; j++){
		        bingo[i][j] = sc.nextInt();
		    }
		}
		int n = sc.nextInt();
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
		    b[i] = sc.nextInt();
		}
		
		// 計算
		String result = "No";
		for(int i = 0; i < 3; i++){
		    for(int j = 0; j < 3; j++){
		        for(int k = 0; k < n; k++){
		            if(bingo[i][j] == b[k]) bingo[i][j] = 0;
		        }
		    }
		}
		for(int i = 0; i < 3; i++){
		    boolean flg = true;
		    for(int j = 0; j < 3; j++){
		        if(bingo[i][j] != 0) flg =false;
		    }
		    if(flg) result = "Yes";
		}
		for(int i = 0; i < 3; i++){
		    boolean flg = true;
		    for(int j = 0; j < 3; j++){
		        if(bingo[j][i] != 0) flg = false;
		    }
		    if(flg) result = "Yes";
		}
		if(bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0) result = "Yes";
		if(bingo[0][2] == 0 && bingo[1][1] == 0 && bingo[2][0] == 0) result = "Yes";
		
		// 出力
		System.out.println(result);
	}
}
