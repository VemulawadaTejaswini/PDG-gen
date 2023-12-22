import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());

    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next()) / 400;
    }

    int color = 0;
    int free = 0;
    boolean[] flag = new boolean[8];
    for (int i = 0; i < n; i++) {
      switch (a[i]) {
        case 0:
          if (!flag[0]) {
            color++;
            flag[0] = true;
          }
          break;
        case 1:
          if (!flag[1]) {
            color++;
            flag[1] = true;
          }
          break;
        case 2:
          if (!flag[2]) {
            color++;
            flag[2] = true;
          }
          break;
        case 3:
          if (!flag[3]) {
            color++;
            flag[3] = true;
          }
          break;
        case 4:
          if (!flag[4]) {
            color++;
            flag[4] = true;
          }
          break;
        case 5:
          if (!flag[5]) {
            color++;
            flag[5] = true;
          }
          break;
        case 6:
          if (!flag[6]) {
            color++;
            flag[6] = true;
          }
          break;
        case 7:
          if (!flag[7]) {
            color++;
            flag[7] = true;
          }
          break;
        case 8:
        default:
          free++;
          break;
      }

    }
    System.out.print(Math.max(color, 1) + " ");
    System.out.println(color + free);
    sc.close();
  }
}