import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();

    long b = sc.nextLong();
    long size = a * b;
    if (size % 2 == 0) System.out.println(size/2);
    else System.out.println(size/2+1);
  }
}
