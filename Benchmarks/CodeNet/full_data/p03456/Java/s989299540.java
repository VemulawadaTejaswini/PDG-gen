import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // 1つ目の整数
    int a = sc.nextInt();
    // 2つ目の整数
    int b = sc.nextInt();

    String first = Integer.toString(a);
    String second = Integer.toString(b);
    String targetStr = first + second;

    int target = new Integer(targetStr);
    int num;
    for (int i = 1; i <= 1000; i++) {
      num = i * i;
      if (num == target) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}