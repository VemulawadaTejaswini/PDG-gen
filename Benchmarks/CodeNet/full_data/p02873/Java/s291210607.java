import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split("");
    String last = s[0];
    int n = 0;
    int sum = 0;
    for(int i = 0; i < s.length; i++) {
      if(s[i].equals(last)) {
        n++;
      } else {
        sum += n * (n - 1) / 2;
        last = s[i];
      }
    }
    System.out.println(sum);
  }
}