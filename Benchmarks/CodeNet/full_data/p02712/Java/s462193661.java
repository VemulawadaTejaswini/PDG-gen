import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int data1[] = new int[N];
    int total = 0;
    //int c = 0;

    for (int i = 0 ; i < 15 ; i++ ) {
      data1[i] = i+1 ;
    }

    // for (int i = 0 ; i < 15 ; i++ ) {
    //   if (data1[i]%15 != 0 || data1[i]%3 != 0 || data1[i]%5 != 0) {
    //     c++;
    //   }
    // }

    int data2[] = new int[N];

    for (int i = 0 ; i < N ; i++ ) {
      if (data1[i]%15 != 0 && data1[i]%3 != 0 && data1[i]%5 != 0) {
        data2[i] = data1[i];
        System.out.println(data2[i]);
      }
    }

    for (int i = 0 ; i < N ; i++ ) {
      total = data2[i] + total;
    }
    System.out.println(total);
  }
}
