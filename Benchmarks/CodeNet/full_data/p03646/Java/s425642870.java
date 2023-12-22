/**
 * Created at 13:26 on 2019/03/08
 */

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

  static FastScanner sc = new FastScanner();

  static int N;
  static TreeList<Integer> a;

  public static void main(String[] args) {

    /*
    for (int i=0; i<100; i++) {
      operation();
    }
    */

    long K = sc.nextLong();

    long N = (int)(K / 1e16) + 1;
    if (N < 2) N = 2;

    long q = (K+N*(N-1)) / N;
    int r = (int)(K % N);

    long[] a = new long[(int)N];
    for (int i=0; i<N; i++) {
      if (i < r) a[i] = q + r;
      else a[i] = q - r;
    }

    long dif = (operation(N, a) - K) / N;

    System.out.println(N);
    System.out.print(a[0] - dif);
    for (int i=1; i<N; i++) {
      System.out.print(" " + (a[i] - dif));
    }

    System.out.println();

  }

  static long operation(long N, long[] original) {

    long[] a = new long[(int)N];
    for (int i=0; i<N; i++) {
      a[i] = original[i];
    }

    long[] qs = new long[(int)N];
    long[] rs = new long[(int)N];
    long qSum;

    long ans = 0;

    do {

      qSum = 0;

      for (int i=0; i<N; i++) {
        qs[i] = a[i] / N;
        rs[i] = a[i] % N;
        qSum += qs[i];
      }

      ans += qSum;

      for (int i = 0; i < N; i++) {
        a[i] = rs[i] + (qSum - qs[i]);
      }

    } while (qSum > 0);

    return ans;
  }

  static void operation() {
    N = sc.nextInt();

    Debugger.start();

    BigInt[] a = new BigInt[N];

    for (int i=0; i<N; i++) {
      a[i] = new BigInt(sc.nextLong());
    }

    BigInt[][] b = new BigInt[N][2];
    BigInt qSum;

    BigInt ans = BigInt.ZERO;

    do {

      qSum = BigInt.ZERO;

      for (int i=0; i<N; i++) {
        b[i] = a[i].divideAndRemainder(N);
        qSum = qSum.add(b[i][0]);
      }

      ans = ans.add(qSum);

      for (int i = 0; i < N; i++) {
        a[i] = b[i][1].add(qSum.subtract(b[i][0]));
      }

    } while (!qSum.equals(BigInt.ZERO));

    System.out.println(ans.toString());

    Debugger.printTime();

  }

  static class Debugger {

    static long startTime;
    static boolean on = true;

    //入力受け取り後に呼び出す(入力時間をカウントしないため)
    static void start() {
      startTime = System.currentTimeMillis();
    }

    static void printTime() {
      if (on) System.out.println("(" + (System.currentTimeMillis() - startTime) + "ms)");
    }

    static void toggle() {
      on = !on;
    }

  }

  static class BigInt extends BigInteger {

    BigInteger MOD = new BigInteger("1000000007");
    static BigInt ZERO = new BigInt(0);
    static BigInt ONE = new BigInt(1);
    static BigInt TEN = new BigInt(10);

    public BigInt(long l) {
      super(Long.toString(l));
    }

    public BigInt(BigInteger i) {
      super(i.toByteArray());
    }

    public BigInt pow(int i) { return new BigInt(super.pow(i)); }

    public BigInt[] divideAndRemainder(long l) { return divideAndRemainder(new BigInt(l)); }

    public BigInt[] divideAndRemainder(BigInt i) {
      BigInt[] ret = new BigInt[2];
      BigInteger[] dAndR = super.divideAndRemainder(i);
      ret[0] = new BigInt(dAndR[0]);
      ret[1] = new BigInt(dAndR[1]);
      return ret;
    }

    public BigInt mod(long l) { return mod(new BigInt(l)); }

    public BigInt mod(BigInt i) { return new BigInt(super.mod(i)); }

    public BigInt mod() {
      return new BigInt(super.mod(MOD));
    }

    public BigInt add(long l) {
      return add(new BigInt(l));
    }

    public BigInt add(BigInt i) {
      return new BigInt(super.add(i));
    }

    public BigInt subtract(long l) {
      return subtract(new BigInt(l));
    }

    public BigInt subtract(BigInt i) {
      return new BigInt(super.subtract(i));
    }

    public BigInt multiply(long l) {
      return multiply(new BigInt(l));
    }

    public BigInt multiply(BigInt i) {
      return new BigInt(super.multiply(i));
    }

    public BigInt divide(long l) {
      return divide(new BigInt(l));
    }

    public BigInt divide(BigInt i) {
      return new BigInt(super.divide(i));
    }

    public BigInt abs() {
      return new BigInt(super.abs());
    }

  }

  /*
    add()でインデックスを指定しない場合指定されたソート順に違わない位置に追加する
    (ただしソートされていることが前提となる)
    Comparatorが0を返したとき、それらの順序は保証しない
    (TreeSet, TreeMapと違い削除はしない)
   */
  static class TreeList<E> extends ArrayList<E> {

    Comparator<? super E> comparator;

    TreeList(Comparator<? super E> c) {
      super();
      comparator = c;
    }

    /*
      ソート済みのリストに要素を追加する
     */
    public boolean add(E e) {
      int lowIndex = 0;
      int highIndex = size() - 1;
      int index = 0;

      if (size() == 0) {
        super.add(e);
        return true;
      }

      if (comparator.compare(e, get(0)) < 0) {
        index = 0;
      } else if (comparator.compare(e, get(highIndex)) > 0) {
        index = highIndex + 1;
      } else {
        while (lowIndex <= highIndex) {

          if (highIndex == lowIndex + 1 || highIndex == lowIndex) {
            index = highIndex;
            break;
          }

          int midIndex = (lowIndex + highIndex) / 2;
          ;

          if (comparator.compare(e, get(midIndex)) > 0) {
            lowIndex = midIndex;
          } else {
            highIndex = midIndex;
          }

        }
      }

      super.add(index, e);
      return true;
    }

  }

  static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
        minus = true;
        b = readByte();
      }
      if (b < '0' || '9' < b) {
        throw new NumberFormatException();
      }
      while (true) {
        if ('0' <= b && b <= '9') {
          n *= 10;
          n += b - '0';
        } else if (b == -1 || !isPrintableChar(b)) {
          return minus ? -n : n;
        } else {
          throw new NumberFormatException();
        }
        b = readByte();
      }
    }

    public int nextInt() {
      return (int) nextLong();
    }
  }

}
