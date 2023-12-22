import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] arr = new int[N];
    for(int i=0;i<N;i++) {
      arr[i] = scanner.nextInt();
    }

    int count = 0;
    for(int i=0;i<N;i++) {
      for(int j=i;j<N;j++) {
        if(i==j) {
//          System.out.println(String.format("(%d,%d)", i, j));
          count++;
        } else {
          boolean ok = true;
          int sum = 0;
          for(int k=i;k<j;k++) {
            sum += arr[k];
          }
          if(plusAndXorEqual(sum, arr[j])) {
//            System.out.println(String.format("(%d,%d)", i, j));
            count++;
          } else {
            break;
          }
        }
      }
    }

    System.out.println(count);

    scanner.close();
  }

  private static boolean plusAndXorEqual(int a, int b) {
    return (a+b) == (a^b);
  }
}
