import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int X = scan.nextInt();
    
    while(true){
      
      int count = 0;
      for (int i = 2; i < (X-1); i++){
        if (X % i == 0){
          count++;
          break;
        }
      }
      
      if (count == 0){
        System.out.println(X);
        return;
      }
      X++;
    }
  }
}