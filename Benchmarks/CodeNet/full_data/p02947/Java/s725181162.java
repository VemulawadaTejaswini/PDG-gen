import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    scan.nextLine();
    long[] result = new long[N];
    byte[][] results = new byte[N][];
    for (int i = 0; i < N; i++) {
      String s = scan.nextLine();
      results[i] = foo(s);
    }

    int count = 0;
    for (int i = 0; i < N - 1; i++) {
      for (int j = i + 1; j < N - 1; j++) {
        if (bar(results[i], results[j + 1])) {
          count++;
        }
      }
    }
    
    System.out.println(count);
  }

  private static byte[] foo(String str) {
    byte[] b = str.getBytes();
    Arrays.sort(b);
    return b;
  }

  private static boolean bar(byte[] b1, byte[] b2) {
    for (int i = 0; i < 10; i++) {
      if (b1[i] != b2[i]) {
        return false;
      }
    }
    return true;
  }

  private static long hoge(String str) {
    long result = 0;
    for (int i = 0; i < str.length(); i++) {
      result += fuga(str.charAt(i));
    }
    return result;
  }

  private static long fuga(char c) {
    switch (c) {
      case 'a':
        return 1;
      case 'b':
        return 2;
      case 'c':
        return 4;
      case 'd':
        return 8;
      case 'e':
        return 16;
      case 'f':
        return 32;
      case 'g':
        return 64;
      case 'h':
        return 128;
      case 'i':
        return 256;
      case 'j':
        return 512;
      case 'k':
        return 1024;
      case 'l':
        return 2048;
      case 'm':
        return 4096;
      case 'n':
        return 8192;
      case 'o':
        return 16384;
      case 'p':
        return 32768;
      case 'q':
        return 65536;
      case 'r':
        return 131072;
      case 's':
        return 262144;
      case 't':
        return 524288;
      case 'u':
        return 1048576;
      case 'v':
        return 2097152;
      case 'w':
        return 4194304;
      case 'x':
        return 8388608;
      case 'y':
        return 16777216;
      case 'z':
        return 33554432;
      default:
        throw new RuntimeException();
    }
  }

}
