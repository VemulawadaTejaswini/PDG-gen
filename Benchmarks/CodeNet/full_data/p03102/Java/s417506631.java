import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();
    int ans = 0;
    int[] b = new int[m];
    for(int i=0; i<m; i++)
      b[i] = sc.nextInt();
    for(int i=0; i<n; i++){
      int calc = 0;
      for(int j=0; j<m; j++)
        calc += b[j]*sc.nextInt();
      if(calc + c > 0) ++ans;
    }
    System.out.println(ans);
  }
 }