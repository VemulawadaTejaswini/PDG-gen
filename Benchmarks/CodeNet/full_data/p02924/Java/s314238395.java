//MondSum
import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    long total=0;
    for (int i=0;i<n;i++) {
      a[i]=i+1;
      total=total+a[i];
    }
     System.out.println(total-a[n-1]);
  }
}

