import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    // 素数かどうかを表す
    int[] prime = new int[100001];
    for(int i = 2; i < 100001; i++) {
      int f = 1;
      for(int j = 2; j * j <= i; j++) {
        if((i % j) == 0) {
          f = 0;
          break;
        }
      }
      prime[i] = f;
    }
    // i以下の似た数の個数を表す
    int[] like = new int[100001];
    for(int i = 2; i < 100001; i++) {
      like[i] = like[i - 1];
      if(((i % 2) == 1) && (prime[i] == 1) && (prime[(i + 1) / 2] == 1)) like[i]++;
    }
    for(int i = 0; i < q; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      System.out.println(like[r] - like[l - 1]);
    }
  }
}