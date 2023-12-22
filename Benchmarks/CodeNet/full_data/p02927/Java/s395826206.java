import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt(), D = sc.nextInt();
    int count = 0;
    int first, second;
    for (int i = 4; i <= M; i++)
      for(int j = 22; j <= D; j++) {
        first = j % 10;
        second = j / 10;
        if(first >= 2 && second >= 2 && first * second == i)
          count++;
      }
    System.out.println(count);
  }
}