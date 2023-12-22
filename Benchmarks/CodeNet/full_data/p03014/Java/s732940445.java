import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	   	int h = sc.nextInt();
	   	int w = sc.nextInt();
	   	char[][] map = new char[h][w];
	   	int[][] l = new int[h][w];
	   	int[][] r = new int[h][w];
	   	int[][] u = new int[h][w];
	   	int[][] d = new int[h][w];
	   	for(int i = 0; i < h; i++) {
	   		map[i] = sc.next().toCharArray();
	   		for(int j = 0; j < w; j++) {
	   			if(map[i][j]=='.'&&j>0) {
	   				l[i][j]=l[i][j-1]+1;
	   			}
	   			else if(map[i][j]=='.'&&j==0) {
	   				l[i][j] = 1;
	   			}
	   			if(map[i][j]=='.'&&i>0) {
	   				d[i][j] = d[i-1][j]+1;
	   			}
	   			else if(map[i][j]=='.'&&i==0) {
	   				d[i][j] = 1;
	   			}
	   		}
	   		for(int j = w-1; j >= 0; j--) {
	   			if(map[i][j]=='.'&&j<w-1) {
	   				r[i][j]=r[i][j+1]+1;
	   			}
	   			else if(map[i][j]=='.'&&j==w-1) {
	   				r[i][j] = 1;
	   			}
	   		}
	   	}
	   	int sum = 0;
	   	int ans = 0;
	   	for(int i = h-1; i >= 0; i--) {
	   		for(int j = w-1; j >= 0; j--) {
	   			if(map[i][j]=='.'&&i+1<=h-1) {
	   				u[i][j]=u[i+1][j]+1;
	   			}
	   			else if(map[i][j]=='.'&&i==h-1) {
	   				u[i][j] = 1;
	   			}
	   			sum = r[i][j]+l[i][j]+d[i][j]+u[i][j]-3;
	   			if(ans<sum) {
	   				ans = sum;
	   			}
	   			//System.out.println(u[i][j]);
	   		}
	   	}
	   	System.out.println(ans);
	 }
}