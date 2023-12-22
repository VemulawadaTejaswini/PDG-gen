import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();//買い物の数
    int m=sc.nextInt();//割引券の数
    double a[]=new double[n];//買うものの値段

    for (int i=0;i<n;i++) {
      a[i]=sc.nextInt();
    }

    double temp;
    for (int i=0;i<m;i++) {
      for (int j=0;j<n-1;j++) {
          if (a[j]<a[j+1]) {
             temp=a[j];
             a[j]=a[j+1];
             a[j+1]=temp;
        }
      }
      a[0]=Math.floor(a[0]/2);
    }

    double total=0;
    for (int i=0;i<n;i++) {
      total=total+a[i];
    }

    System.out.println(total);

  }
}
