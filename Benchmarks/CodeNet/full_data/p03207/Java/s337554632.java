import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    integer a[] = new integer[N];
    for(int i = 0; i < N ; i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a, Comparator.reverseOrder());

    a[0] = a[0]/2;

    int sum = 0;

    for(int i = 0; i < N; i++){
      sum += a[i];
    }

}
}