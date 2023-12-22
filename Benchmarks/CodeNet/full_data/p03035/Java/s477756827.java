import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int age = scan.nextInt();
    int price = scan.nextInt();
    if (6 <= age && age <= 12) {
      System.out.println(price/2);
    }
    else if (age < 6) {
      System.out.println("0");
    }
    else {
      System.out.println(price);
    }
  }
}