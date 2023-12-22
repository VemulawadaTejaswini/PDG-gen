import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    int total = 0;
    int data[] = new int[N];

    for (int i = 0 ; i < N ; i++ ) {
      data[i] = sc.nextInt();
    }

    for (int i = 0 ; i < N ; i++ ) {
        total = data[i] + total;
    }
    //System.out.println(total);

    if (total >= H) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
