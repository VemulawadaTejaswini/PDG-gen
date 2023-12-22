import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int h = sc.nextInt();
    int a = sc.nextInt();
    
    int result = h / a;
    if (h%a>0) {
      result ++;
    }
    
    System.out.println(result);
    
  }
}