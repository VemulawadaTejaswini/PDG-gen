import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int x = N;

    while(x > 0)
      x /= 10;

    while(!(N <= 10*10*x + 10*x + 1*x))
      x++;

    System.out.println(10*10*x + 10*x + 1*x);

  }
}
