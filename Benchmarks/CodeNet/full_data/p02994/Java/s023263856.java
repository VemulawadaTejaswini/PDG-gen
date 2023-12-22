import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int[] data = new int[n+1];
    int sum = 0;

    for(int i = 1;i <= n;i++) {
      data[i] = l + i - 1;
      sum += data[i];
    }

    int min = Math.abs(sum - data[1]);
    int j = 1;

    for(int i = 1;i <= n;i++) {
      int x = Math.abs(sum - data[i]);

      if(min < x) {
        j = i;
      }
    }

    System.out.println(sum - data[j]);

  }

}
