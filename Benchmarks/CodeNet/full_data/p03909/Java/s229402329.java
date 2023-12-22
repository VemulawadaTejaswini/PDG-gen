import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    StringBuilder ans = new StringBuilder();;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        String s = sc.next();
        if ("snuke".equals(s)) {
          ans.append((char)('A'+j)).append(i+1); 
        }
      }
    }
    System.out.println(ans.toString());
  }
}