import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[4];
    for(int i = 0; i < 4; i++) {
      a[i] = n % 10;
      n /= 10;
    }
    String ans = "No";
    int c = 0;
    for(int i = 0; i < 3; i++) {
      if(a[i] != a[i + 1]) c = 1;
    }
    int d = 0;
    for(int i = 1; i < 4; i++) {
      if(a[i] != a[i + 1]) d = 1;
    }
    if((c == 0) || (d == 0)) ans = "Yes";
    System.out.println(ans);
  }
}