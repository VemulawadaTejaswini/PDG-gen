import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String[] str = sc.nextLine().split(" ");
    long a = Long.parseLong(str[0]);
    long b = Long.parseLong(str[1]);
    long x = Long.parseLong(str[2]);
    long count = 0;
    
    count = b / x - (a - 1) / x;
    if (a == 0) count++;
    
    System.out.println(count);
  }
}