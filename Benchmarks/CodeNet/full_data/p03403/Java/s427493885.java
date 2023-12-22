import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    int total = 0;
    int now = n;
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
      total += Math.abs(a[i] - a[now]);
      now = i;
    }
    total += Math.abs(a[n-1]-a[n]);
    now = n;
    for(int i = 0;i<n;i++){
      int to = total;
      to += Math.abs(a[now] - a[i+1]) - Math.abs(a[i] - a[now]) - Math.abs(a[i+1] - a[i]);
      System.out.println(to);
      now = i;
    }
  }
}
