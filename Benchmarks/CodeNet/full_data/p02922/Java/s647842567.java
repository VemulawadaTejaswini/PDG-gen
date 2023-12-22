import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int num = 1;
    int count = 0;
    while(num < b) {
      num += (a - 1);
      count++;
    }
    System.out.println(count);
  }
}