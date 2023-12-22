import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    String S = sc.next();
    int[] count = new int[4];
    int OK =0;
    for (int i =0; i<4; i++) {
      for (int j =0; j<4; j++) {
        if (S.charAt(i) == S.charAt(j)) {
          count[i]++;
        }
      }
    }
    for (int i=0; i<4; i++) {
      if (count[i] != 2) {
        System.out.println("No");
        OK++;
        break;
      } 
    }  
    if (OK ==0) System.out.println("Yes");
  }
}