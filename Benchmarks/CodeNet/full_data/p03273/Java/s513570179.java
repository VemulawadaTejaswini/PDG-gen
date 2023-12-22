import java.util.*;
 
public class Main {
  public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    String[][] str = new String[H][W];
    boolean [] b1 = new boolean [H];
    boolean [] b2 = new boolean [W];
    
    for(int i=0;i<H;i++) {
      str[i]=sc.next().split("");
      for(int j=0;j<W;j++) {
        if(str[i][j].equals("#")) {
          b1[i]=true;
          b2[j]=true;
        }
      }
    }
 
    for(int i=0;i<H;i++) {
      if(b1[i]=true) {
        for(int j=0;j<W;j++) {
          if(b2[j]=true) {
            System.out.print(str[i][j]);
          }
        }
        System.out.println("");
      }
    }
  }
}