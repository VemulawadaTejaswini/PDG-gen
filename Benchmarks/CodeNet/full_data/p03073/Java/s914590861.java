
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    String color = cin.next();

    int mark = 0;
    int count = 0;
    for (int i=0;i<color.length();i++) {
      char item = color.charAt(i);
      if (mark == item - '0') {
        count++;
      }

      mark = mark == 0? 1:0;

    }

    int res = count <= color.length() - count? count:color.length()-count;
    System.out.println(res);

  }

}