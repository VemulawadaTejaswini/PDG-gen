import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    long[] a = new long[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextLong();
    }
    Main abc117D = new Main();
    System.out.println(abc117D.solve(N, K, a));
  }

  public long solve(int N, long K, long[] a) {
    int N2 = N / 2;
    long defaultBits = ~0;
    List<Long> xorBits = new ArrayList();
    List<Boolean> bitsOn = new ArrayList();
    long b = 1;
    while (K >= b) {
      xorBits.add(b);
      if ((K & b) > 0) bitsOn.add(true);
      else bitsOn.add(false);
      defaultBits = defaultBits^b;
      b = b << 1;
    }
    int bitLen = xorBits.size();
    int[] bitsAggregate = new int[bitLen];


    long defaultSum = 0;
    for (long x : a) {
      defaultSum += defaultBits & x;
      for (int z = 0; z < xorBits.size(); z++) {
        if ((xorBits.get(z) & x) > 0) {
          bitsAggregate[z] += 1;
        }
      }
    }

    long xor1 = 0;
    long xor2 = 0;
    long sum1 = 0; // 一番左のbitが1
    long sum2 = 0; // 一番左のbitが0
    b = 1;
    for (int j = 0; j < bitsAggregate.length; j++) {
      boolean off = bitsAggregate[j] <= N2;
      if (bitsOn.get(j) && off){
        xor1 += b;
        sum1 += b * (N - bitsAggregate[j]);
      } else {
        sum1 += b * bitsAggregate[j];
      }
      if (off && j < bitsAggregate.length - 1) {
        xor2 += b;
        sum2 += b * (N - bitsAggregate[j]);
      } else {
        sum2 += b * bitsAggregate[j];
      }
      b = b << 1;
    }
    long xor = xor1;
    if(sum1 > sum2){
//      xor = xor1;
//      return defaultSum+sum1;
    } else {
//      xor = xor2;
//      return defaultSum+sum2;
    }
    long ans = 0;
    for (long x : a) {
      ans += x^xor;
    }
    return ans;
  }
}
