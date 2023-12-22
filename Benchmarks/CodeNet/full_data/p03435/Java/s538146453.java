import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int[][] c = new int[3][3];
    c[0][0] = Integer.parseInt(sc.next());
    c[0][1] = Integer.parseInt(sc.next());
    c[0][2] = Integer.parseInt(sc.next());
    c[1][0] = Integer.parseInt(sc.next());
    c[1][1] = Integer.parseInt(sc.next());
    c[1][2] = Integer.parseInt(sc.next());
    c[2][0] = Integer.parseInt(sc.next());
    c[2][1] = Integer.parseInt(sc.next());
    c[2][2] = Integer.parseInt(sc.next());
    
    int[] a = new int[3];
    int[] b = new int[3];
    a[0] = 0;
    b[0] = c[0][0] - a[0];
    b[1] = c[0][1] - a[0];
    b[2] = c[0][2] - a[0];
    a[1] = c[1][1] - b[1];
    a[2] = c[2][1] - b[1];
    
    String ans = "Yes";
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        if(c[i][j] != a[i] + b[j]){
          ans = "No";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}