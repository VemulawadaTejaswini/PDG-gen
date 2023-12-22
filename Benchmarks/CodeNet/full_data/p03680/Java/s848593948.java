import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N+1];
    for (int i=0; i<N; i++) {
      a[i+1] = sc.nextInt();
    }
    int point =1;
    int check =-1;
    for (int i=1; i<N+1; i++) {
      point = a[point];
      if (point == 2) {
        check =i;
        break;
      }
    }
    System.out.println(check);
  }
}