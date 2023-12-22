import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[][] = new int[3][3];
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        a[i][j] = Integer.parseInt(sc.next());
      }
    }
    int n = Integer.parseInt(sc.next());
    int b = 0;
    
    for(int i=0; i<n; i++){
      b = Integer.parseInt(sc.next());
      
      for(int ii=0; ii<3; ii++){
        for(int jj=0; jj<3; jj++){
          if(a[ii][jj] == b){
            a[ii][jj] = -1;
          }
        }
      }
      
    }

    if(   (a[0][0] == -1 && a[0][1] == -1 && a[0][2] == -1)
       || (a[1][0] == -1 && a[1][1] == -1 && a[1][2] == -1)
       || (a[2][0] == -1 && a[2][1] == -1 && a[2][2] == -1)
       || (a[0][0] == -1 && a[1][0] == -1 && a[2][0] == -1)
       || (a[0][1] == -1 && a[1][1] == -1 && a[2][1] == -1)
       || (a[0][2] == -1 && a[1][2] == -1 && a[2][2] == -1)
       || (a[0][0] == -1 && a[1][1] == -1 && a[2][2] == -1)
       || (a[2][0] == -1 && a[1][1] == -1 && a[0][2] == -1)
      ) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    
  }
  
}
