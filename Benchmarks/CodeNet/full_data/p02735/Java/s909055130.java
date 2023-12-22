import java.util.*;

class Point {
	int x;
	int y;
	Point(int a, int b) {
		this.x = a;
		this.y = b;
	}
}
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		for(int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		double[][] memo = new double[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				memo[i][j] = 0;
			}
		}
		if(map[0][0] == '#') {
			memo[0][0]++;
		}
		for(int i = 1; i < h+w-1; i++) {
			int first = i;
			int xnow=0;
			int ynow=0;
			if(first < h) {
				xnow = 0;
				ynow = i;
			}
			else {
				xnow = first-(h-1);
				ynow = h-1;
			}
			while(xnow < w){
				if(xnow == 0) {
					if(map[ynow][xnow] == '#') {
						memo[ynow][xnow] = memo[ynow-1][xnow]+1;
					}
					else {memo[ynow][xnow] = memo[ynow-1][xnow];}
					ynow--;
					xnow++;
				}
				else if(ynow == 0) {
						if(map[ynow][xnow] == '#') {
							memo[ynow][xnow] = memo[ynow][xnow-1]+1;
						}
						else {memo[ynow][xnow] = memo[ynow][xnow-1];}
						ynow--;
						xnow++;
						break;
				}
				else if(xnow != 0 && ynow != 0){
					if(map[ynow][xnow] == '#') {
						memo[ynow][xnow] = Math.min(memo[ynow-1][xnow],memo[ynow][xnow-1])+1;
					}
					else {memo[ynow][xnow] = Math.min(memo[ynow-1][xnow],memo[ynow][xnow-1]);}
					ynow--;
					xnow++;
				}
			}
		}
		System.out.println((int)memo[h-1][w-1]);
	}
}