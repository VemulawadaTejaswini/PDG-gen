import java.util.*;
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int data[] = new int[n];
    int total[] = new int[n+1];
    int count = 0 ;
    total[0] = 0;

    for (int i = 0 ; i < n ; i++ ) {
      data[i] = sc.nextInt();
    }

    for (int i = 0 ; i < n; i++ ) {
      total[i+1] = data[i] + total[i];
    }

    for (int i = 0 ; i < n+1 ; i++ ) {
      if (total[i] <= x) {
        count++;
      }
    }
    System.out.println(count);
  }
}
