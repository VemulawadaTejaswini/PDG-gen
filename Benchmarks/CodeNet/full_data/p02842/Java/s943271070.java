import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int X = (int)(N / 1.08);
    if ((int)(X*1.08) == N) System.out.println(X);
    else if ((int)((X+1)*1.08) == N) System.out.println(X+1);
    else System.out.println(":(");
  }
}
