import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int bricks[] = new int[n];
    for (int i=0; i<n; i++) {
      bricks[i] = sc.nextInt();
    }
    
    int result = 0;
    int brickCount = 1;
    for (int i=0; i<n; i++) {
      if (bricks[i]==brickCount) {
        brickCount++;
      }
      else {
        result++;
      }
    }
    
    if (brickCount==1) {
      result = -1;
    }
    System.out.println(result);
        
  }
}