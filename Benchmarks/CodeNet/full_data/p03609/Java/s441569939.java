import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int t = sc.nextInt();
    int answer = x - t;
    if (answer < 0) {
      answer = 0;
    }
    System.out.println(answer);
  }
}
