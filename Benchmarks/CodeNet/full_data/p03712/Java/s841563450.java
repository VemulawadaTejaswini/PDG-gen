import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();
    String[] p = new String[h];
    for(int i = 0; i < h; i++) {
      p[i] = sc.next();
    }

    for(int i = 0; i < h + 2; i++) {
      for(int j = 0; j < w + 2; j++) {
        if(i == 0 || i == h + 1) {
          System.out.print("#");
        } else if(j == 0 || j == w + 1) {
          System.out.print("#");
        } else if(i > 0 && i < h + 1 && j == 1){
          System.out.print(p[i - 1]);
        }
      }
      System.out.println();
    }

  }
}
