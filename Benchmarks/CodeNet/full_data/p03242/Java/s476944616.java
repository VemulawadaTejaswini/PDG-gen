
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

    //Scanner cin = new Scanner(new FileReader("input.txt"));
   Scanner cin = new Scanner (System.in);

    String num = cin.next();
    StringBuffer res = new StringBuffer();
    for (int i=0;i<num.length();i++){
      if (num.charAt(i)=='1') res.append('9');
      else if (num.charAt(i)=='9') res.append('1');
    }
    System.out.println(res.toString());

  }

}