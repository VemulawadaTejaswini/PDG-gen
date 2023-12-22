import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    boolean result = false;
    for(int i = 1; i < 10; i++) {
	    for(int j = 1; j < 10; j++) {
          int x = i * j;
          if(a == x) {
            result = true;
            break;
          }
        }
      if(result) {
        break;
      }
    }
    
    if(result) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    } 
  }
}
