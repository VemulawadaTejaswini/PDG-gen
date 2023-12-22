import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    final int x = sc.nextInt();
    final int a = sc.nextInt();
    System.out.println(x < a ? 0 : 10);
  }
}