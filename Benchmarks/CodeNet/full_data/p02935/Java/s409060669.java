import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    double ans=(double)a[0];
    for(int i=1;i<n-1;i++){
      ans=(double)(ans+a[i])/2.0;
    }
    System.out.println(ans);
  }
}