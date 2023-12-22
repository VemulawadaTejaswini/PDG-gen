import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    // int[] A = new int[N - 1];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      B[i] = 0;
    }
    for (int i = 0; i < N -1; i++) {
      int tmp = Integer.parseInt(sc.next()) -1;
      B[tmp] = B[tmp] +1;
    }
    for (int i = 0; i < N; i++) {
      System.out.println(B[i]);
    }

  }
}

