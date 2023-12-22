import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h, w;
		h = scan.nextInt();
		w = scan.nextInt();
		String s;
		char X[][] = new char[h][w];
		for(int i = 0; i < h; i++){
			s = scan.next();
			for(int j = 0; j < w; j++)
				X[i][j] = s.charAt(j);
		}
		scan.close();

		int Y[][] = new int[h+2][w+2];
		for(int i = 0; i < h+2; i++)
			for(int j = 0; j < w+2; j++)
				Y[i][j] = 0;
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(X[i][j]=='#')findBomb(i+1,j+1,Y);
			}
		}
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(X[i][j]=='.')System.out.print(Y[i+1][j+1]);
				else System.out.print('#');
			}
			System.out.println();
		}
		
	}
	
	static void findBomb(int x, int y, int array[][]){
		for(int i = x - 1; i < x + 2; i++)
			for(int j = y - 1; j < y + 2; j++){
				array[i][j]++;
			}
		array[x][y]--;
	}
}