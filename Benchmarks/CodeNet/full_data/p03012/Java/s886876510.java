import java.util.*;
 
class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int n=sc.nextInt();
    int a[] = new int[n+1];
    a[0]=0;
    for(int i=1;i<=n;i++){
      a[i]=a[i-1]+sc.nextInt();
    }
    int min=10000000;
    for(int t=1;t<n;t++){
      min=Math.min(Math.abs((a[t]-a[0])-(a[n]-a[t])),min);
    }
    System.out.println(min);
  }
}