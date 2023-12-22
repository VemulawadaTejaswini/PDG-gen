import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int age = sc.nextInt();
    int price = sc.nextInt();

    int pay = 0;

    if (age >= 13) {
      pay = price;
    } else if (age >= 6 && age <= 12) {
      pay = price / 2;
    } else if (age <= 6) {
      pay = 0;
    }

    System.out.println(pay);
  }
}
