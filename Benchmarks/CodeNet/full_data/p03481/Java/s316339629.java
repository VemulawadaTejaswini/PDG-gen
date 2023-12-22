import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    long X = scn.nextLong();
    long Y = scn.nextLong();

    long count = 1;
    while (X < Y) {
      X *= 2;
      count++;
    }

    System.out.println(count);

  }
}