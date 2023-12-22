import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int n = X/100;
    if (n*5 > X%100) System.out.println(1);
    else System.out.println(0);
  }
}
