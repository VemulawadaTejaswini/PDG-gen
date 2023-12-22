import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[m];
    int[] b = new int[m];
    int[] num = new int[n];
    for(int i=0;i<m;i++){
      a[i] = sc.nextInt();
      num[a[i]-1]++;
      b[i] = sc.nextInt();
      num[b[i]-1]++;
    }
    for(int i=0;i<n;i++) System.out.println(num[i]);
  }
}