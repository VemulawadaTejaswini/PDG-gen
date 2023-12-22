import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean ans = false;

    for(int i = 1 ; i <= 9 ; ++i){
      for(int j = 1 ; j <= 9 ; ++j){
        if(i*j==n){
          ans = true;
          break;
        }
      }
    }
    if(ans) System.out.println("Yes");
    else System.out.println("No");
    
  }
}