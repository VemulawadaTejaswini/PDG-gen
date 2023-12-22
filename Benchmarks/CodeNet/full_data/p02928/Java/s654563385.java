import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int ten=0;
    int jun=0;
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        if(a[i]>a[j]){
          ten++;
        }else if(a[i]<a[j]){
          jun++;
        }
      }
    }
    
    System.out.println( ((calc(ten,k)+calc(jun,k-1)))%1000000007 );
  }
  static int calc(int b,int p){
    int modder = 1000000007;
    return (int)((1.0*b*(p+1)*p/2)%modder);
  }
}