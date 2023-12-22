import java.util.*;

class Main {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    System.out.println(transferTask(a, b, c));
  }

  private static int transferTask(int a, int b, int c) {
    return c - (a - b);
  }
}