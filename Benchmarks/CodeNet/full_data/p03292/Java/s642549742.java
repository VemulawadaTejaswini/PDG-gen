import java.util.*;
import static java.lang.Math.*;


public class Main {
  public static void main(String[] args) {
    int[] myArgs = new int[3];
    Scanner sc = new Scanner(System.in);
    myArgs[0] = sc.nextInt();
    myArgs[1] = sc.nextInt();
    myArgs[2] = sc.nextInt();

    Main_103 logic = new Main_103();
    String output = logic.exec(myArgs);
    System.out.print(output);

  }

  private String exec(int[] myArgs) {
    long minCost = Long.MAX_VALUE;
    for (int i = 0;i < 3;i++) {
      for (int j = 0;j < 3;j++) {
        if (i != j) {
          long cost0 = abs(myArgs[i] - myArgs[j]);
          for (int k = 0;k < 3;k++) {
            if (i != k && j != k) {
              long cost1 = cost0 + abs(myArgs[j] - myArgs[k]);
              if (minCost > cost1) {
                minCost = cost1;
              }
              break;
            }
          }
        }
      }
    }
    return String.valueOf(minCost);
  }