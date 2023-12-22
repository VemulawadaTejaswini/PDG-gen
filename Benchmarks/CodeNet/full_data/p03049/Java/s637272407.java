
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    List<String> saved = new ArrayList<>();
    int n = cin.nextInt();

    int res = 0;
    int concateA = 0;
    int concateB = 0;
    for (int i=0;i<n;i++) {
      String line = cin.next();
//      System.out.println(line);
      saved.add(line);
//      System.out.println("len "+line.length());
      if (line.contains("AB"))
        res++;
      if (line.lastIndexOf('A') == line.length()-1)
        concateA++;
      if (line.indexOf('B') == 0)
        concateB++;
    }
//    System.out.println("A "+concateA+" B "+concateB);
    if (concateA==n&&concateB==n) {
      System.out.println(res+n-1);
    }
    else {
      res = res + Math.min(concateA, concateB);
      System.out.println(res);
    }

  }

}
