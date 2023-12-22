import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long X = sc.nextLong();

    sc.close();

    int i = 0;
    long count = 0;

    while (count < X) {
      i++;
      count += i;
    }

    System.out.println(i);
    
  }

}