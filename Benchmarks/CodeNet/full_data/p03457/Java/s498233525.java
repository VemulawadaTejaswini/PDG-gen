import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count =0;
    int check =0;
    while (sc.hasNext()) {
      count++;
      int t = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      if (x+y > t) break;
      if ((t+x+y) % 2 == 1) break;
      check++;
    } 
      if (check == count ) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
  }
}