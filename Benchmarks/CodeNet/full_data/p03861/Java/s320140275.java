import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c;
    long x = sc.nextLong();
    if(a%x == 0) {
      c = a / x -1;
    }else {
      c = a / x;
    }
    System.out.println(b/x-c);
  }
}
