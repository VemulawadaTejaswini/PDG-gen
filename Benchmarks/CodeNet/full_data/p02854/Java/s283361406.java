import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int ans = 0;
    int left = 0;
    int right = 0;
    
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    
    if(n%2==0){
      for(int i=0;i<n/2;i++){
        left += a[i];
        right += a[n-1-i];
      }
      if(left>=right){
        ans = left - right;
      }else{
        ans = right - left;
      }
    }else{
      for(int i=0;i<n/2;i++){
        left += a[i];
        right += a[n-1-i];
      }
      int left2 = left + a[(n/2)];
      int right2 = right + a[(n/2)];
      if(left2<=right2){
        ans = left2 - right;
      }else{
        ans = right2 - left;
      }
    }
    System.out.println(ans);
    
  }
}