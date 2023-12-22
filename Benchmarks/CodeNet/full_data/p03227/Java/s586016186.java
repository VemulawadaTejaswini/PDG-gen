
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

    //Scanner cin = new Scanner(new FileReader("input.txt"));
   Scanner cin = new Scanner(System.in);
    String in = cin.next();

    if (in.length()==2) {
      System.out.println(in);
    }

    else if (in.length()==3) {
      String res = new StringBuilder(in).reverse().toString();
      System.out.println(res);
    }

  }

}