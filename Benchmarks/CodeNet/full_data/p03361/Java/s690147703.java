import java.util.Scanner;


class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int h, w;
		h = scan.nextInt();
		w = scan.nextInt();
		String s;
		char X[][] = new char[h+2][w+2];
		for(int i = 0; i < h+2; i++)
			for(int j = 0; j < w+2; j++)
				X[i][j] = '.';
		
		for(int i = 1; i <= h; i++){
			s = scan.next();
			for(int j = 1; j <= w ; j++)
				X[i][j] = s.charAt(j-1);
		}
		scan.close();

		char Y[][] = new char[h+2][w+2];
		for(int i = 0; i < h+2; i++)
			for(int j = 0; j < w+2; j++)
				Y[i][j] = '.';

		Boolean flag = true;
		
		for(int i = 1; i <= h; i++){
			for(int j = 1; j <= w; j++){
				if(X[i][j]=='#')
					if(!drawing(i,j,X,Y)){
						flag = false;
					}
			}
		}
		
		System.out.print(flag?"YES":"NO");
	}

	static Boolean drawing(int x, int y, char ArrayX[][], char ArrayY[][]){
		if(ArrayX[x][y-1] == '#'){
			ArrayY[x][y] = '#';
			ArrayY[x][y-1] = '#';
			return true;
		}
		else if(ArrayX[x][y+1] == '#'){
			ArrayY[x][y] = '#';
			ArrayY[x][y+1] = '#';
			return true;
		}
		else if(ArrayX[x-1][y] == '#'){
			ArrayY[x][y] = '#';
			ArrayY[x-1][y] = '#';
			return true;
		}
		else if(ArrayX[x+1][y] == '#'){
			ArrayY[x][y] = '#';
			ArrayY[x+1][y] = '#';
			return true;
		}
		else return false;
	}
}