import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();    
    
    boolean continueFlg = true;
    if (x==2) {
      continueFlg = false;
    }
    while (continueFlg) {
      for (int i=2; i<x; i++) {
        if (x%i==0) {
          break;
        }
        if (i==x-1) {
          continueFlg = false;
        }
      }
      if (continueFlg) {
        x++;
      }
    }
    System.out.println(x);
    
  } 
}