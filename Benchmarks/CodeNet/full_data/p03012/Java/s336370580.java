import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int w[]=new int[n];
    int total=0;
    for (int i=0;i<n;i++) {
      w[i]=sc.nextInt();
    }
    int a[]=new int[n+1];
    for (int i=0;i<n;i++) {
      a[i+1]=a[i]+w[i];
      total=total+w[i];
    }

    // for (int i=0;i<a.length;i++) {
    //   System.out.println(a[i]);
    // }

    int min=100;

    for (int i=0;i<a.length;i++) {
      int b1=a[i];
      int b2=total-a[i];
      int ans=Math.abs(b1-b2);
      min=Math.min(min,ans);

    }

    System.out.println(min);

  }
}
