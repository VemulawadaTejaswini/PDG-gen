import java.util.Scanner;

public class Main{
  
  public void helpFunc(int N, int[][] mat){
  	
    for(int i=1; i<N; i++)
    {
      for(int j=0; j < N-i; j++)
      {
        mat[i][j] = Math.abs(mat[i-1][j] - mat[i-1][j+1]);
      }
    }
    System.out.println(mat[N-1][0]);
  }
  
  static public void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int N = sc.nextInt();
    int mat[][] = new int[N][N];
    String s;
    s = sc.next();
    for(int j=0; j<N; j++)
    {
      mat[0][j] = Integer.valueOf(s.charAt(j)) - 48;
    }
    
    Main obj = new Main();
    obj.helpFunc(N, mat);
  }
}