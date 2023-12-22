import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] strings = new String[3];
    strings[0] = scanner.next();
    strings[1] = scanner.next();
    strings[2] = scanner.next();
    scanner.close();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      int[] counts = new int[3];
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          if (strings[j].charAt(i) != strings[k].charAt(i)) {
            counts[j]++;
          }
        }
      }
      int min = counts[0];
      if (counts[1] < min) {
        min = counts[1];
      }
      if (counts[2] < min) {
        min = counts[2];
      }
      ans += min;

    }
    System.out.println(ans);
  }

}
