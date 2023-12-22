import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[n];
    long sum = 0;

    for(int i = 0;i < n;i++) {
      data[i] = sc.nextInt();
    }

    for(int i = 0;i < n;i++) {
      for(int j = i+1;j < n;j++) {
        sum += data[i] * data[j];
      }
    }

    System.out.println(sum);

  }

}
