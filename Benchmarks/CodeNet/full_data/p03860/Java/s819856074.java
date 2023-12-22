import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    new Main().a();

  }

  private void a() {
    try (Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {

      String input = in.nextLine();
      String[] words = input.split(" ");

      for (final String word:words
           ) {
        System.out.print(word.charAt(0));
      }
      System.out.println();
    }
  }
}
