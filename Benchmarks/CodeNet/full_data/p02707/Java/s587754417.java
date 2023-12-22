import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for (int i=1;i<n;i++) {
      a[sc.nextInt()-1]++;
    }

    for (int i=0;i<a.length;i++) {
      System.out.println(a[i]);
    }
  }
}
