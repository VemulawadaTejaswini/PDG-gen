import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String str = scanner.next();
      
      if (str == "Sunny") System.out.println("Cluody");
      else if (str == "Cloudy") System.out.println("Rainy");
      else if (str == "Rainy") System.out.println("Sunny");
    }
}