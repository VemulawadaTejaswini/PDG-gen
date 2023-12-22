import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		boolean ans = true;
		int[][] c = new int[3][3];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				c[i][j] = in.nextInt();
			}
		}
		
		if(!(c[0][0] - c[0][1] == c[1][0] - c[1][1] && c[2][0] - c[2][1] == c[1][0] - c[1][1])) ans = false;
		if(!(c[0][2] - c[0][1] == c[1][2] - c[1][1] && c[2][2] - c[2][1] == c[1][2] - c[1][1])) ans = false;
		
		if(!(c[0][0] - c[1][0] == c[0][1] - c[1][1] && c[0][2] - c[1][2] == c[0][1] - c[1][1])) ans = false;
		if(!(c[2][0] - c[1][0] == c[2][1] - c[1][1] && c[2][2] - c[1][2] == c[2][1] - c[1][1])) ans = false;
		
		System.out.println(ans ? "Yes" : "No");
	}
}
