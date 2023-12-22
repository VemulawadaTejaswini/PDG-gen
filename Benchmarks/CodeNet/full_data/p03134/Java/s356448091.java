import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		Strint s = sc.next();
		String[] strs = s.split("");
		int strnum = strs.length
		int[][] balls = new int[strnum][2];
		
		int r = 0;
		int b = 0;
		for(int i=0; i<strnum; i++){
			if(strs[i].equals("0")){
				r += 2;
			}
			if(strs[i].equals("1")){
				r += 1;
				b += 1;
			}
			if(strs[i].equals("2")){
				b += 2;
			}
			balls[i][0] = r;
			balls[i][1] = b;
		}
		
		int[][] pascal = new int[strnum][strnum];
		pascal[0][0] = 1;
		pascal[0][1] = 1;
		int[][] ballpat = new int[strnum][strnum];
		if(strs[0].equals("0")){
			ballpat[0][0] = 1;
			ballpat[0][1] = 0;
		}
		if(strs[i].equals("1")){
			ballpat[0][0] = 1;
			ballpat[0][1] = 1;
		}
		if(strs[i].equals("2")){
			ballpat[0][0] = 0;
			ballpat[0][1] = 1;
		}
		for(int i=1; i<strnum; i++){
			pascal[i][0] = 1;
			pascal[i][i+1] = 1;
			for(int j=1; j<=i; j++){
				pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
			}
			int s = 1;
			int e = i;
			if(balls[i][0] < i){
				for(int j=0; j<i-balls[i][0]; j++){
					ballpat[i][j] = 0;
				}
				s = i-balls[i][0];
			}
			if(balls[i][1] < i){
				for(int j=0; j<i-balls[i][1]; j++){
					ballpat[i][i+1-j] = 0;
				}
				e = balls[i][1] + 1;
			}
			for(int j=s; j<=e; j++){
				ballpat[i][j] = ballpat[i-1][j-1] + ballpat[i-1][j];
			}
		}
		
		for(int i=0; i<strnum+1; i++){
			ans += pascal[strnum-1][i] * ballpat[strnum-1][i];
		}
		
		System.out.println(ans);
	}
}
