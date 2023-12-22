import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int end = sc.nextInt();
    int min = sc.nextInt();
    int max = sc.nextInt();
    sc.close();

    long sum = 0;

    for (int i = 1; i <= end; i++) {
      int x = getXxx(i);

      if (min <= x && x <= max) {
        sum += i;
      }
    }

    System.out.println(sum);
    
  }

  private static int getXxx(int num) {

    int result = 0;

    while(num > 0) {
      result += num % 10;
      num /= 10;
    }

    return result;

  }
}	