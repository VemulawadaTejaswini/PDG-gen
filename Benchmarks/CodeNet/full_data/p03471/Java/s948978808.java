import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, one, five, ten, value;
    boolean flag = true;
    number = Integer.parseInt(sc.next());
    value = Integer.parseInt(sc.next());
    for(one = 0; one <= number; one++) {
      for(five = 0; five <= number - one; five++) {
        ten = number - one - five;
        if(one * 1000 + five * 5000 + ten * 10000 == value) {
          System.out.println(one + " " + five + " " + ten);
          flag = false;
        }
      }
    }
    if(flag) System.out.println("-1 -1 -1");
  }
}
