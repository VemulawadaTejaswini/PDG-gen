import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();
    String a[] = new String[h+2];
    String b = "";

    for (int j = 0; j < w+2; j++) {
      b += "#";
    }

    for (int i = 0; i < h+2; i++) {
      if (i == 0 || i == h+1) {
        a[i] = b;
      } else {
        a[i] = "#" + sc.next() + "#";
      }
    }

    for (int i = 0; i < (h+2); i++) {
      System.out.println(a[i]);
    }
  }  
}
