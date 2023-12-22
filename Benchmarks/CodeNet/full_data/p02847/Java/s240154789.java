import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
  public static void main(String[] args){
    System.out.println(new Main().excute(System.in)); 
  }
  public String excute(InputStream f) {
    Scanner scan = new Scanner(f);
    String s =  scan.next();

    String[] w = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

    return "" + (7 - IntStream.range(0, w.length)
                .filter(i ->  w[i].equals(s))
                .sum());
  }
}
