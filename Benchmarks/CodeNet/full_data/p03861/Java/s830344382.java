import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long x = scanner.nextLong();

    long count = (b / x) - (a / x);
    
    if(a == 0L) {
      count++;
    }
    
    System.out.println(count);
  }
}