import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
  static class AAA implements Comparable<AAA> {
    int price;
    int number;

    public AAA(int a, int b) {
      price = a;
      number = b;
    }

    @Override
    public int compareTo(AAA a) {
      return this.price - a.price;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // スペース区切りの整数の入力(NとM)
    int N = sc.nextInt();
    int M = sc.nextInt();
    long total = 0;
    int[] A = new int[N];
    int[] B = new int[N];
    for (int k = 0; k < N; k++) {
      A[k] = sc.nextInt();
      B[k] = sc.nextInt();
    }
    ArrayList<AAA> shopInfo = new ArrayList<>();
    for (int k = 0; k < N; k++) {
      shopInfo.add(new AAA(A[k], B[k]));
    }
    Collections.sort(shopInfo);
    for (int k = 0; k < N; k++) {
      if (shopInfo.get(k).number >= M) {
        total = total + shopInfo.get(k).price * M;
        break;
      } else {
        total = shopInfo.get(k).price * shopInfo.get(k).number;
        M = M - shopInfo.get(k).number; 
      }
    }
    System.out.println(total);
  }
}