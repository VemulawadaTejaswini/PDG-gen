import java.util.*;
public class main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int flag=0;
    for(int i=1;i<=n-2;i++){
      if(arr[i]!=arr[i-1]^arr[i+1]){
        flag=1;
      }
    }
    if(arr[0]!=arr[1]^arr[n-1]){
      flag=1;
    }
    if(arr[n-1]!=arr[n-2]^arr[0]){
      flag=1;
    }
    if(flag==0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
