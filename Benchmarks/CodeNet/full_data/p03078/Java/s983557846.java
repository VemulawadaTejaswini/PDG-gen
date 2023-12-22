import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

  static int N;
  static int K;
  static long Q;
  static int A;
  static int B;
  static long C;
  static double min = 9999999;
  static long ans = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();

    int k = scanner.nextInt();

    long[] A = new long[x];
    long[] B = new long[y];
    long[] C = new long[z];

    for (int i = 0; i < x; i++) {
      A[i] = scanner.nextLong();
    }
    for (int i = 0; i < y; i++) {
      B[i] = scanner.nextLong();
    }
    for (int i = 0; i < z; i++) {
      C[i] = scanner.nextLong();
    }
    Arrays.sort(A);
    Arrays.sort(B);
    Arrays.sort(C);

//    System.out.println(A[0]);

    long min = A[x - Math.min(10,x)] + B[y - Math.min(10,y)] + C[z - Math.min(10,z)];

    ArrayList<Long> map = new ArrayList();


    for (int i = x - 1; i >= 0; i--) {
      for (int j = y - 1; j >= 0; j--) {
        for (int l = z - 1; l >= 0; l--) {
          if(A[i] + B[j] + C[l] < min)break;
          map.add(A[i] + B[j] + C[l] );
        }
      }
    }



//    long[] ansMap = map.toArray(new Long[10]);
//    Arrays.sort(ansMap);

      Collections.sort(map,  Collections.reverseOrder());

    for (int i = 0; i < Math.min(k,map.size()); i++) {
      System.out.println(map.get(i));
    }

  }


}
