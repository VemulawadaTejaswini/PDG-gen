import java.util.Scanner;

public class Main {
	static int[][] c;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		
		c = new int[h][w];
		
		if(d%2 == 0){
			paint(-2*d, -2*d, h, w, d, 0);
			paint(-d, -2*d, h, w, d, 1);
			paint(-d-d/2, -d-d/2, h, w, d, 2);
			paint(-d-d/2, -d+d/2, h, w, d, 3);
		}else{
			c[0][0] = 0;
			for(int i=1; i<h; i++){
				if(c[i-1][0] == 0) c[i][0] = 1;
				if(c[i-1][0] == 1) c[i][0] = 2;
				if(c[i-1][0] == 2) c[i][0] = 3;
				if(c[i-1][0] == 3) c[i][0] = 0;
			}
			for(int i=0; i<h; i++){
				for(int j=1; j<w; j++){
					if(c[i][j-1] == 0) c[i][j] = 1;
					if(c[i][j-1] == 1) c[i][j] = 2;
					if(c[i][j-1] == 2) c[i][j] = 3;
					if(c[i][j-1] == 3) c[i][j] = 0;
				}
			}
		}	
		
		for(int i=0; i<h; i++){
			String s = "";
			for(int j=0; j<w; j++){
				String ns = "";
				if(c[i][j] == 0) ns = "R";
				if(c[i][j] == 1) ns = "Y";
				if(c[i][j] == 2) ns = "G";
				if(c[i][j] == 3) ns = "B";
				s = s + ns;
			}
			System.out.println(s);
		}
	}
	
	public static void paint(int x0, int y0, int h, int w, int d, int color){
		for(int i=x0; i<w+d*3; i+=d*2){
			for(int j=y0; j<h+d*3; j+=d*2){
				paint2(i, j, h, w, d, color);
			}
		}
		for(int i=x0+d; i<w+d*3; i+=d*2){
			for(int j=y0+d; j<h+d*3; j+=d*2){
				paint2(i, j, h, w, d, color);
			}
		}
	}
	
	public static void paint2(int x0, int y0, int h, int w, int d, int color){
		for(int i=0; i<d/2; i++){
			for(int j=i; j<d-i; j++){
				paint3(x0+j, y0+i, h, w, color);
				paint3(x0+j, y0-i, h, w, color);
			}
		}
	}
	
	public static void paint3(int x, int y, int h, int w, int color){
		if(x>=0 && x<w && y>=0 && y<h){
			c[y][x] = color;
		}
	}
}
