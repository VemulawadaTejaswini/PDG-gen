import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String s = sc.nextLine();
      String r = "";
      switch (s) {
        case "A":
          r = "T";
          break;
        case "T":
          r = "A";
          break;
        case "C":
          r = "G";
          break;
        case "G":
          r = "C";
          break;
      }
      System.out.println(r);
    }
  }
}