import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    try(
      Scanner scanner = new Scanner(System.in);) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if(b/a == (double)b/a){
        System.out.println(b + a);
      } else {
        System.out.println(b - a);
      }
    }
  }
}