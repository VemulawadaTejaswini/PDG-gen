import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    int length = s.length();
    int halfLength = s.length()/2;
    int count = 0;
    for (int i=0; i<halfLength; i++) {
      if (s.charAt(i)!=s.charAt(length-(i+1))) {
        count ++ ;
      }
    }
    
    System.out.println(count);
  }
}
