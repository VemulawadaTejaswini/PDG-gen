import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int count = 0;
    
    if (a == b) {
      count ++;
    }
    if (b == c) {
      count ++;
    }
    if (c == a) {
      count ++;
    }
    System.out.println(count);
  }
}