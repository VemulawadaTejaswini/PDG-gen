import java.util.*;
import java.io.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] P = new int[M];
    int[] Y = new int[M];

    int[][] arr = new int[M][4];

    for (int i = 0; i < M; i++) {
      P[i] = sc.nextInt() - 1;
      Y[i] = sc.nextInt();
      arr[i][0] = P[i];
      arr[i][1] = Y[i];
      arr[i][2] = 0;
      arr[i][3] = i;
    }

    sc.close();

    int[] count = new int[N];

    Arrays.sort(arr, (a,b) -> Integer.compare(a[1],b[1]));

    for (int i = 0; i < M; i++) {
      count[arr[i][0]]++;
      arr[i][2] = count[arr[i][0]];
    }

    Arrays.sort(arr, (a,b) -> Integer.compare(a[3],b[3]));

    PrintWriter out = new PrintWriter(System.out);
    
    for (int i = 0; i < M; i++) {
      out.println(String.format("%06d", arr[i][0]+1) + String.format("%06d", arr[i][2]));
    }

    out.flush();

  }

}