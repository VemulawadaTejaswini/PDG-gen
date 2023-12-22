import java.util.*;
 
class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    long l = Long.parseLong(s, 2);
    
    int ans1 = 0;
    for(long i = 0; i < s.length(); i++) {
      if (i%2 == 1) {
        if ((1 & l>>i) == 0) {
          ans1++;
        }
      } else {
        if ((1 & l>>i) == 1) {
          ans1++;
        }
      }
    }
    int ans2 = 0;
    for(long i = 0; i < s.length(); i++) {
      if (i%2 == 0) {
        if ((1 & l>>i) == 0) {
          ans2++;
        }
      } else {
        if ((1 & l>>i) == 1) {
          ans2++;
        }
      }
    }
    System.out.println(Math.min(ans1, ans2));
  }
}