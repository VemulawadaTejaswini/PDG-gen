import java.util.*;
class Main{
  public static int secondLargest(int a[],int l,int r){
    int large=a[l];
    int sec=a[l];
    for(int i=l;i<=r;i++){
      if(large<a[i]){
      	sec=large;
        large=a[i];
      }
      else if(sec<a[i]) sec=a[i];
    }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[]= new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        sum+=secondLargest(a,i,j);
      }
    }
    System.out.println(sum);
  }
}
      