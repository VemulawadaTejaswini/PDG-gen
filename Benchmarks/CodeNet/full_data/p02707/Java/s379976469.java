import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n+1];
    for (int i=1;i<n;i++) {
      a[i]=sc.nextInt();
    }

    for (int i=1;i<=n;i++) {
      for (int j=0;j<n;j++) {
        if (a[j]==i) {
          b[i]++;
        }
      }
    }

    for (int i=1;i<=n;i++) {
      System.out.println(b[i]);
    }

  }
}
