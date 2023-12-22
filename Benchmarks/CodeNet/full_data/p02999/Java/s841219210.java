
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int x = cin.nextInt();
    int a = cin.nextInt();

    if (x < a) {
      System.out.println(0);
    }
    else {
      System.out.println(10);
    }

  }

}
