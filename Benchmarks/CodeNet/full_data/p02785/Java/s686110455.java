import java.util.*;
import java.util.Arrays;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(arr);
    int total = 0;
    for (int j = 0; j < N - K; j++) {
        total += arr[j];
    }
    System.out.println(total);
  }
}

