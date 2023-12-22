import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
  public static void main(String[] args){
    System.out.println(new Main().excute(System.in)); 
  }
  public String excute(InputStream f) {
    Scanner scan = new Scanner(f);
    String[] s =  scan.next().split("");

    return "" + IntStream.range(0, s.length/2)
                .filter(i -> !(s[i].equals(s[s.length-i-1])))
                .count();
  }
}
