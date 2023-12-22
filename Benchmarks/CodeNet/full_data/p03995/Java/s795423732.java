import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
int col = sc.nextInt();
int n = sc.nextInt();
int[][] table = new int[row][col];
for(int i = 0; i < row; i++) {
  for(int j = 0; j < col; j++) {
     table[i][j] = -1;
  }
}

while(sc.hasNext()) {
   int iRow = sc.nextInt() - 1;
   int iCol = sc.nextInt() - 1;
   table[iRow][iCol] = sc.nextInt();
}

//for(int i = 0; i < row; i++) {
//  for(int j = 0; j < col; j++) {
//     System.out.println(table[i][j]);
//  }
//}

System.out.println(checkNoNeg(table, row, col));

}

public static int[][] updateSquare(int[][] input){
return null;
}

public static String checkNoNeg(int[][] input, int row, int col) {
   for(int i = 0; i < row; i++) {
   for(int j = 0; j < col; j++) {
   if( input[i][j] < 0) {
   return "No";
}
}
   }
return "Yes";

}

}