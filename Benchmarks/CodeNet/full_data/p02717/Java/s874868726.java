import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();

      int d;

      d = a;
      a = b;
      b = d;

      d = a;
      a = c;
      c = d;

      System.out.println(a+" "+b+" "+c);
      
      }

  }
