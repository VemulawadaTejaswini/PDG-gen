import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  int N = scan.nextInt();
	  int M = scan.nextInt();
	  int[] P = new int[M];
	  int[] Y = new int[M];
	  int[] P_copy = new int[M];
	  int[] Y_copy = new int[M];
	  for( int i = 0; i < M; i++ ) {
		  P[i] = scan.nextInt();
		  Y[i] = scan.nextInt();
	  }
	  for( int i = 0; i < M; i++ ) {
		  P_copy[i] = P[i];
		  Y_copy[i] = Y[i];
	  }
	  for( int i = 0; i < M - 1; i++ ) {
		  for( int j = i + 1; j < M; j++ ) {
			  int p_tmp;
			  int y_tmp;
			  if( P_copy[i] > P_copy[j] ) {
				  p_tmp = P_copy[i];
				  P_copy[i] = P_copy[j];
				  P_copy[j] = p_tmp;
				  y_tmp = Y_copy[i];
				  Y_copy[i] = Y_copy[j];
				  Y_copy[j] = y_tmp;
			  }
		  }
	  }

	  for( int i = 0; i < M - 1; i++ ) {
		  for( int j = i + 1; j < M; j++ ) {
			  int p_tmp;
			  int y_tmp;
			  if( Y_copy[i] > Y_copy[j] && P_copy[i] == P_copy[j] ) {
				  p_tmp = P_copy[i];
				  P_copy[i] = P_copy[j];
				  P_copy[j] = p_tmp;
				  y_tmp = Y_copy[i];
				  Y_copy[i] = Y_copy[j];
				  Y_copy[j] = y_tmp;
			  }
		  }
	  }
	  String[][] ans = new String[M][2];
	  for( int i = 0; i < ans.length; i++ ) {
		  ans[i][0] = "";
		  ans[i][1] = "";
	  }
	  int x = 1;
	  int tmp = 0;
	  for( int i = 0; i < M; i++ ) {
		  if( tmp != P_copy[i] ) {
			  tmp = P_copy[i];
			  x = 1;
		  }
		  for( int j = 0; j < M; j++ ) {
			  if( P_copy[i] == P[j] && Y_copy[i] == Y[j] ) {
				  ans[j][0] = String.format( "%06d", P_copy[i] );
				  ans[j][1] = String.format( "%06d", x );
				  x++;
				  break;
			  }
		  }
	  }
	  for( int i = 0; i < M; i++ ) {
		  System.out.println( ans[i][0] + ans[i][1] );
	  }
  }
}