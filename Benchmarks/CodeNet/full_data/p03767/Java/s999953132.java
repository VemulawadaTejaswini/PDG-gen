import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[3*n];
    for(int i=0;i<3*n;i++) a[i] = sc.nextLong();
    Arrays.sort(a);
    int num = 3*n-1-n;
    long sum=0;
    for(int i=0;i<n;i++) sum+=a[num-i];
    System.out.println(sum);
  }
}