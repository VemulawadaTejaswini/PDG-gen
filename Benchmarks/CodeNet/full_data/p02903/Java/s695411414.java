import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    for(int i = 0; i < h; i++) {
      String s = "";
      if(i < b) {
        for(int j = 0; j < a; j++) {
          s += "0";
        }
        for(int j = 0; j < w - a; j++) {
          s += "1";
        }
      } else {
        for(int j = 0; j < a; j++) {
          s += "1";
        }
        for(int j = 0; j < w - a; j++) {
          s += "0";
        }
      }
      System.out.println(s);
    }
  }
}