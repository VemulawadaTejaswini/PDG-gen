import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String s = sc.next();
      String r = "";
      switch (s) {
        case "A":
          r = "T";
        case "T":
          r = "A";
        case "C":
          r = "G";
        case "G":
          r = "C";
      }
      System.out.println(r);
    }
  }
}