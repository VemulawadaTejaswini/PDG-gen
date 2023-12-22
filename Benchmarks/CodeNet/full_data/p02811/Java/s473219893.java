import java.util.*;
class Main {
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    A();
    
    
  }
  
  private static void A(){
    
    int n = sc.nextInt();
    int val = sc.nextInt();
    System.out.print((n*500 >= val)?"Yes":"No");
  }
}

