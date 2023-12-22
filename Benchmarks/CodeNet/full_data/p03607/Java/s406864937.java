import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 1;
    int sub = 0;
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] =  sc.nextInt();
    }
    Arrays.sort(a);

    sub = a[0];
    for(int i = 1; i < n; i++) {
      sub = a[i];
      if(sub == a[i-1]) {
        count--;
      }else {
        count++;
      }
    }
    System.out.println(count);
  }
}
