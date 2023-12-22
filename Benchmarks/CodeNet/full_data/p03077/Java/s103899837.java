import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int abcde[] = new int[5];
    for (int i = 0; i < 6; i++) {
      nabcde[i] = sc.nextInt();
    }
    int ans = 0;
    int set[] = new int[5];
    set[0] = nabcde[0];
    int i = 0;
    int ans = 0;
    while (set[set.length - 1] == nabcde[0]) {
      set[i + 1] = set[i] - nabcde[i + 1];
      set[i] = set[i] - set[i + 1];
      i++;
      ans++;
    }
    System.out.println(ans);
  }
}