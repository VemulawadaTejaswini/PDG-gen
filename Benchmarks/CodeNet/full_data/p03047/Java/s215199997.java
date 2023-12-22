
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt();
    int k = cin.nextInt();
    int res = n-k+1;
    if (res>=0) {
      System.out.println(res);
    }
    else {
      System.out.println(0);
    }
  }

}
