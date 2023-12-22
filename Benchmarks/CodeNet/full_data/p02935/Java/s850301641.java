import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    double sum=(a[0]+a[1])/2.0;
    Arrays.sort(A);
    for(int i=2;i<n;i++){
      sum+=(sum+a[i])/2.0);
    }
    System.out.println(sum);
  }
}