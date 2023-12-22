import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int b = sc.nextInt();
    int r = sc.nextInt();
    if(b != 0 && r != 0) {
      System.out.println(n-r);
    } else if(r == 0) {
      System.out.println(b);
    } else {
      System.out.println("0");
    }
  }
}
