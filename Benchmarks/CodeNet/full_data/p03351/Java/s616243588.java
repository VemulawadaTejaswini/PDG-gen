import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    System.out.println(Math.max(Math.abs(a - b), Math.abs(b - c)) <= d || Math.abs(a - c) <= d ? "Yes" : "No");
  }
}