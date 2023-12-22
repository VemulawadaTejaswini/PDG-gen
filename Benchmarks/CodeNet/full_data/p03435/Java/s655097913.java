import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w_diffs[] = new int[2];
    int h_diffs[] = new int[2];
    int m[][] = new int[3][3];
    boolean con = true;
    
    
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        m[i][j] = sc.nextInt();
      }
    }
    
    w_diffs[0] = m[0][1] - m[0][0];
    w_diffs[1] = m[0][2] - m[0][1];
    
    h_diffs[0] = m[1][0] - m[0][0];
    h_diffs[1] = m[2][0] - m[1][0];
    
    for(int i = 1; i < 3 && con; i++){
      for(int j = 0; j < 2; j++){
      	if(m[i][j+1] - m[i][j] != w_diffs[j]) con = false;
        if(m[j+1][i] - m[j][i] != h_diffs[j]) con = false;
      }
    }
        
    if(con) System.out.println("Yes");
    else System.out.println("No");
  }
}
