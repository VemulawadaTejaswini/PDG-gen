import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n+1];
    for(int i = 0;i<n+1;i++){
      a[i] = sc.nextLong();
    }
    long[] b = new long[n];
    for(int i = 0;i<n;i++)b[i] = sc.nextLong();

    long max = 0l;
    for(int i = 0;i<n;i++){
      if(a[i]>=b[i]){
        max+=b[i];
      }else{
        max+=a[i];
        b[i]-=a[i];
        if(a[i+1]>=b[i]){
          max+=b[i];
          a[i+1]-=b[i];
        }else{
          max+=a[i+1];
          a[i+1]=0;
        }
      }
    }
    System.out.println(max);
  }
}
