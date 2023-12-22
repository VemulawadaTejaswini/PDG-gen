import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int C = sc.nextInt();

    int[][] D = new int[ C ][ C ];
    for(int i = 0 ;i < C ; i ++){
      for(int j = 0 ; j < C ; j ++){
        D[i][j] = sc.nextInt();
      }
    }

    int[][] c = new int[ N ][ N ];
    int[][] D_3 = new int [ 3 ] [ C ] ;
    for(int i = 0 ; i < N ; i ++){
      for( int j = 0 ; j < N ; j ++ ){
        c[ i ][ j ] = sc.nextInt();
        for(int k = 0 ; k < C ; k ++){
          D_3[ ( i + j ) % 3 ][ k ] += D[ c[i][j] - 1 ][ k ] ;
        }
      }
    }

    long DMin = 25000000L;
    for(int i = 0 ; i < C ; i ++){
      for(int j = 0 ; j < C ;j ++){
        for(int k = 0 ; k < C ; k ++){
          if( i != j && j != k && k != i ){
            long DSum = D_3[0][i] + D_3[1][j] + D_3[2][k];
            if( DSum < DMin ){
              DMin = DSum ;
            }
          }
        }
      }
    }

    System.out.println( DMin );

  }
}
