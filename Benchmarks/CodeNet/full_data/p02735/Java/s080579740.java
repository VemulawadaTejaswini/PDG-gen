import java.util.Scanner;
import java.util.HashMap;

public class Main{
  
  public void helpFunc(int N, int[] mat){
  	int val;
    for(int i=1; i<N; i++)
    {
      for(int j=0; j < N-i; j++)
      { 
        mat[j] = Math.abs(mat[j] - mat[j+1]);
        
      }
    }
    System.out.println(mat[0]);
  }
  
  static public void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int N = sc.nextInt();
    int mat[] = new int[N];
    String s;
    s = sc.next();
    for(int j=0; j<N; j++)
    {
      mat[j] = s.charAt(j) - 48;
    }
    
    Main obj = new Main();
    obj.helpFunc(N, mat);
  }
}