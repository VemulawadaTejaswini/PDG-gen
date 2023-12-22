import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    
    long[] arr = new long[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextLong();
    }
    if(n==1){
      System.out.println("Yes");
    }
    else{
    int flag=0;
    for(int i=1;i<n-1;i++){
      if(arr[i]-arr[i-1]>1 && arr[i]-arr[i+1]>=1){
        flag=1; 
      }
      else if(arr[i]-arr[i-1]>=1 && arr[i]-arr[i+1]>1){
        flag=1;
      }
      else if(arr[i]-arr[i-1]>1 && arr[i]-arr[i+1]>1){
        flag=1;
      }
    }
    if(flag==1){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
  }
  }
}