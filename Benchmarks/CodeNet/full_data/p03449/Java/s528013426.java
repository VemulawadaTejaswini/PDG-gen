import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int step = sc.nextInt();
    int[] top = new int[step];
    for (int i = 0; i < step; i++) {
      top[i] = sc.nextInt();
    }
    int[] bottom = new int[step];
    for (int i = 0; i < step; i++) {
      bottom[i] = sc.nextInt();
    }

    sc.close();

    int sum = 0;
    boolean selectedTop = true;

    for (int i = 0; i < step; i++) {

      if (selectedTop) {
        sum += top[i];

        int sumTop = getSum(top, i + 1);
        int sumBottom = getSum(bottom, i + 1);
        int nowBottom = bottom[i];
  
        if (sumTop < (sumBottom + nowBottom)) {
          selectedTop = false;
          sum += nowBottom;
        }

      } else {
        sum += bottom[i];
      }

    }

    System.out.println(sum);

  }

  private static int getSum(int[] numbers, int startIndex) {

    int sum = 0;

    for (int i = startIndex; i < numbers.length; i++ ) {
      sum += numbers[i];
    }

    return sum;
  }

}