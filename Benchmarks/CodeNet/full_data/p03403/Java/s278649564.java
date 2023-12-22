import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n+1];
    int sum = 0;
    int sp = n;
    for(int i = 0 ; i < n ; ++i){
      a[i] = sc.nextInt();
      sum += Math.abs(a[i] - a[sp]);
      sp = i;
    }
    
    sum += Math.abs(a[n-1]-a[n]);
    sp = n;
    
    for(int i = 0 ; i < n ; ++i){
      int pay = sum;
      pay += Math.abs(a[sp] - a[i+1]) - Math.abs(a[i] - a[sp]) - Math.abs(a[i+1] - a[i]);
      System.out.println(pay);
      sp = i;
    }
  }
}