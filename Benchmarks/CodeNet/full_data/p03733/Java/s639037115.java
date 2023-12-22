
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int tArray[] = new int[n + 1];
    tArray[n] = t;

    for (int i = 0; i < n; i++) {
      tArray[i] = sc.nextInt();
    }

    int count = 0;
    for (int i = 1; i < n; i++) {
      if(tArray[i] - tArray[i-1] > t) {
        count += t;
      } else {
        count += tArray[i] - tArray[i-1];
      }
    }

    count += t;

    System.out.println(count);
  }
}

