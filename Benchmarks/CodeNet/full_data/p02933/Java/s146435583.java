import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String s = sc.nextLine();
    output(a, s);
  }
  public static void output(int a, String s) {
    if (a >= 3200) System.out.println(s);
    else System.out.println("red");
  }
}