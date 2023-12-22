import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int[] antenna = new int[5];

      for (int i = 0; i < antenna.length; ++i) {
        antenna[i] = in.nextInt();
      }

      int k = in.nextInt();
      boolean canDirect = true;
      for (int i = 0; i < antenna.length && canDirect; ++i) {
        for (int j = i + 1; j < antenna.length; ++j) {
          if (Math.abs(antenna[i] - antenna[j]) > k) {
            canDirect = false;
            break;
          }
        }
      }

      if (canDirect) {
        System.out.println("Yay!");
      } else {
        System.out.println(":(");
      }
    }
  }
}