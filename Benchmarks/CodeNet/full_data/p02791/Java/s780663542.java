import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int[] arr1 = new int[n];
    int min = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      if(arr[i]<min){
        min=arr[i];
        arr1[i]=min;
      }
      else{
        arr1[i]=min;
      }
    }
    int ans =0;
    for(int i=0;i<n;i++){
      if(arr[i]<=arr1[i]){
        ans++;
      }
    }
    System.out.println(ans);
  }
}