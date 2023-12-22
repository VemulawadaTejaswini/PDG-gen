import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int X = scanner.nextInt();
    int Y = scanner.nextInt();
    int ans = 1000000;

    for (int i = 0; i <= Math.max(X, Y); i++){
      cost = i * 2 * C + A * Math.max(0, X - i) + B * Math.max(0, Y - i);
      ans = Math.min(ans, cost);
    }
    System.out.println(ans);
  }
}