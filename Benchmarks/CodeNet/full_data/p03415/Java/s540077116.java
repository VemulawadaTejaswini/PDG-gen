import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			char[][] matrix = new char[3][3];

			for(int i = 0; i < 3; i++)
			{
				String str = in.nextLine();
				for(int j = 0; j < 3; j++)
					matrix[i][j] = str.charAt(j);
			}
			for(int k = 0; k < 3; k++)
				System.out.print(matrix[k][k]);
	}
    
}