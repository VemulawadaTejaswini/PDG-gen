import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main (String [] args){
		Scanner s = new Scanner (System.in);
		String inter = s.nextLine().trim();
		String [] interArr = inter.split(" ");
		int H = Integer.parseInt(interArr[0]);
		int W = Integer.parseInt(interArr[1]);
		ArrayList <String> strings = new ArrayList <String>();
		for (int i = 0; i < H; i++){
			strings.add(s.nextLine());
		}
		char [][] matrix = new char [H][W];
		for (int x = 0; x < H; x++){
			for (int y = 0; y < W; y++){
				matrix[x][y] = strings.get(x).charAt(y);
			}
		}
		String [][] matrixOut = new String[H][W];
		for (int x = 0; x < H; x++){
			for (int y = 0; y < W; y++){
				int counter = 0;
				if (matrix[x][y] == '.'){
					if (x - 1 >= 0){
						if (matrix [x-1][y] == '#') counter++;
					}
					if (y - 1 >= 0){
						if (matrix [x][y-1] == '#') counter++;
					}
					if (x -1 >= 0 && y - 1 >= 0){
						if (matrix [x-1][y-1] == '#') counter++;
					}
					if (x + 1 < H){
						if (matrix [x+1][y] == '#') counter++;
					}
					if (y + 1 < W){
						if (matrix [x][y + 1] == '#') counter++;
					}
					if (x + 1 < H && y + 1 < W){
						if (matrix [x+1][y+1] == '#') counter++;
					}
					if (x + 1 < H && y - 1 >= 0){
						if (matrix [x+1][y-1] == '#') counter++;
					}
					if (y + 1 < W && x - 1 >= 0){
						if (matrix [x-1][y+1] == '#') counter++;
					}
					matrixOut[x][y] = Integer.toString(counter);
				} else {
					matrixOut[x][y] = Character.toString(matrix[x][y]);
				}
			}
		}
		// print matrix
		for (int x = 0; x < H; x ++){
			String out = "";
			for (int y = 0; y < W; y ++){
				out += (matrixOut[x][y]);
			}
			System.out.println(out);
		}
		
	}
	
}
