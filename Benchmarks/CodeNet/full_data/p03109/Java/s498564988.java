
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);


    String in = cin.next();

    String newS = in.replaceAll("/", "");
    long year = Long.parseLong(newS);

    if (year > 20190430) {
      System.out.println("TBD");
    }
    else {
      System.out.println("Heisei");
    }

  }

}