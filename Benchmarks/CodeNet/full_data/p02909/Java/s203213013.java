import java.util.*;

class Main {
  private static String[] TENKI = {"Sunny","Cloudy","Rainy"};
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String w = sc.next();
    if (w.equals("Sunny")) {
      System.out.println("Cloudy");
    } else if (w.equals("Cloudy")) {
      System.out.println("Rainy");
    } else if (w.equals("Rainy")) {
      System.out.println("Sunny");
    }
  }
}