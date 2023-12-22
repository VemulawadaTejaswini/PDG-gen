import java.util.*;

public class Main {
  
  public static void main (String[] args){
    
    Main main = new Main();
    main.solve();
  }
  
  private void solve (){
    
    Scanner scanner = new Scanner (System.in);
    
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    
    int kaisuu = B/A;
    
    if (kaisuu>=C){
      System.out.println(C);
    } else {
      System.out.println(kaisuu);
    }
  }
}