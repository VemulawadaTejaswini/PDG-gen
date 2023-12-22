import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt() - i;
    }
    Arrays.sort(a);
    int mid = a[(n-1)/2];
    long sum = 0;
    for(int i = 0; i < n; i++){
      sum += Math.abs(a[i] - mid);
    }
    System.out.println(sum);
  }
}