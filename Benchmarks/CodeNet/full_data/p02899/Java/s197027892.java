import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 1; i <= n; i++){
      a[sc.nextInt() - 1] = i;
    }
    Arrays.stream(a).forEach(num -> {
      System.out.print(num + " ");
    });
  }
}
