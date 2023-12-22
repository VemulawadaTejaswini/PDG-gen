import java.util.Scanner;

public class Main{
  
  public int helpFunc(int H, int W, char[][] mat){
    int r = 0, c = 0, count = 0;
    if(mat[r][c] != '.')
      count++;
    
    while(r != H-1 || c != W-1)
    {
      if(r+1 < H && mat[r+1][c] == '.')
        r=r+1;
      
      else if(c+1 < W && mat[r][c+1] == '.')
        c=c+1;
      
      else if(r+1 < H)
      {
        count++;
        r=r+1;
      }
      else if(c+1 < W)
      {
        count++;
        c=c+1;
      }
    }
    System.out.println(count);
    return count;
  }
  
  static public void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char mat[][] = new char[H][W];
    String s;
    for(int i=0; i<H; i++)
    {
      s = sc.next();
      for(int j=0; j<W; j++)
      {
        mat[i][j] = s.charAt(j);
      }
    }
    
    Main obj = new Main();
    obj.helpFunc(H, W, mat);
  }
}