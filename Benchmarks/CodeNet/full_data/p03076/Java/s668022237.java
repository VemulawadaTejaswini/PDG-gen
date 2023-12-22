import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {

    int[] cookingTime = new int[5];
    int[][] diff = new int[5][2];
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      for (int i = 0; i < 5; i++) {

        BigDecimal tmp = new BigDecimal(br.readLine());
        cookingTime[i] = tmp.intValue();

        tmp = tmp.setScale(-1, RoundingMode.UP);
        diff[i][0] = tmp.intValue() - cookingTime[i];
        diff[i][1] = i;
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    Comparator comparator = new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        final int index = 0;

        int[] numA = (int[]) o1;
        int[] numB = (int[]) o2;
        return (Integer.compare(numA[index], numB[index]));
      }
    };

    Arrays.sort(diff, comparator);

    int sum = 0;
    for (int i = 0; i < diff.length; i++) {
      final int idx = diff[i][1];

      if (i < diff.length - 1) {
        BigDecimal tmp = new BigDecimal(cookingTime[idx]).setScale(-1, RoundingMode.UP);
        sum += tmp.intValue();
      } else {
        sum += cookingTime[idx];
      }
    }
    System.out.print(sum);

  }
}
