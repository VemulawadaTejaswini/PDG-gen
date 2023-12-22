import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] list = new int[6];
    for (int i = 0; i < 6 ; i++ ) {
      list[i] = sc.nextInt();
    }

    int a = list[0];
    int e = list[4];
    int k = list[5];

    if (e - a > k) {
      System.out.println(":(");
    } else {
      System.out.println("Yay!");
    }
  }
}
