import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String s = scanner.next();
    switch (s) {
      case "Sunny":
        System.out.println("Cloudy");
      case "Cloudy":
        System.out.println("Rainy");
      case "Rainy":
        System.out.println("Sunny");
    }
  }
}
