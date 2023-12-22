
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int x = cin.nextInt();

    int len = 0;
    int count = 0;

    while (len <= x) {
      len = len + cin.nextInt();
      count++;
    }

    System.out.println(count);

  }

}