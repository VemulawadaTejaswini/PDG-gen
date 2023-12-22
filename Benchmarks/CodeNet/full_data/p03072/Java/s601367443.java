import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] H = new int[N];
    for (int i =0; i < N; i++) {
      H[i] = sc.nextInt();
    }

    int canLookSpotCnt = 1;
    for(int i = 1; i < N; i++) {
      boolean flag = true;
      for (int j = 0; j < i; j++) {
        if (H[j] > H[i]) flag = false;
      }
      canLookSpotCnt += flag ? 1 : 0;
    }

    System.out.println(canLookSpotCnt);
  }
}
