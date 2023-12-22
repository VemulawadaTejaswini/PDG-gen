import java.util.Scanner;
 
public class Main {
  int getColor(int rate) {
    if (rate < 400)
      return 0;
    if (rate < 800)
      return 1;
    if (rate < 1200)
      return 2;
    if (rate < 1600)
      return 3;
    if (rate < 2000)
      return 4;
    if (rate < 2400)
      return 5;
    if (rate < 2800)
      return 6;
    if (rate < 3200)
      return 7;
    return 8;
  }

  void run() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] num = new int[9];
    for (int i = 0; i < n; i++) {
      int rate = sc.nextInt();
      num[getColor(rate)]++;
    }

    int ans = 0;
    for (int i = 0; i < 8; i++) {
      if (num[i] > 0) {
        ans++;
      }
    }

    int min = ans;
    int max = ans;
    if (num[8] > 0) {
      if (min == 0) {
        min = 1;
      }
      max = max + num[8];
    }
    System.out.println(min + " " + max);
  }

  public static void main(String[] args) {
    new Main().run();
  }
}
