import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n  = Integer.parseInt(sc.next());
    int b0 = Integer.parseInt(sc.next());
    int b1 = Integer.parseInt(sc.next());
    int b2 = Integer.parseInt(sc.next());
    int l[][] = new int[n][n];
    int r[][] = new int[n][n];
    
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++) {
        l[i][j] = Integer.parseInt(sc.next());
      }
    }
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++) {
        r[i][j] = Integer.parseInt(sc.next());
      }
    }
    
    int p = 0;
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++) {
        //if (l[i][j] > 2) {
        if(j==n-1){
          System.out.print(l[i][j] + "\n");
        } else {
          System.out.print(l[i][j] + " ");
        }
        //} else {
        //  System.out.print("2 ");
        //}
      }
      //System.out.print("\n");
    }
    System.out.println("");
  }
}
