import java.util.*;

/**
 * @author masayamatu
 * 
 */
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    int[][] Graph = new int[n+1][n+1];
    int[] count = new int[n+1];
    String ans = "";
    for(int[] i:Graph) {
      Arrays.fill(i,0);
    }
    
    for(int i = 0; i < n-1; i++) {
      int a = sc.nextInt(); int b = sc.nextInt();
      Graph[a][b] = 1;
    }
    for(int i = 0; i < q; i++) {
      int a = sc.nextInt(); int b = sc.nextInt();
      count[a] += b;
      for(int j = 0; j < n+1; j++) {
        if(Graph[a][j] == 1) {
          count[j] += b;
          set(Graph , count , j , b);
        }
      }  
    }
    for(int i = 1; i < n+1; i++) {
      ans += count[i]+ " ";
    }
    System.out.println(ans);
  }
  public static void set(int[][] g,int[] count, int a,int b) {
    for(int i = a; i < count.length; i++) {
      if(g[a][i] == 1) {
        count[i] += b;
        set(g,count,i,b);
    }
    
    }
    
  }
}