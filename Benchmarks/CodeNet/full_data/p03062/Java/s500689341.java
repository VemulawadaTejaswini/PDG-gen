import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }
    
    int ans = 0;
    int ttl = 0;
    for(int i=0; i<n-1; i++){
      ttl = 0;
      a[i] = -1*a[i];
      a[i+1] = -1*a[i+1];
      for(int j=0; j<n; j++){
        ttl += a[j];
      }
      if(ans<ttl){
        ans = ttl;
      }
      a[i]=a[i]*(-1);
      a[i+1]=a[i+1]*(-1)
    }
    System.out.println(ans);
  }
}