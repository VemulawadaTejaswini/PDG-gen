import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int b[] = new int[n - 1];
    int a[] = new int[n];
    
    for(int i = 1; i < n; i++){
      b[i] = sc.nextInt();
    }
    
    for(int i = n - 1; i <= 0; i--){
      if(i == n - 1){
        a[n - 1] = b[n - 1];
      }else if(i == 0){
        a[i] = b[i];
      }else{
        if(b[i] <= b [i - 1]){
          a[i] = b[i];
        }else{
          a[i] = b[i - 1];
        }
      }
    }
    int sum = 0;
    for(int i = 0; i < n; i++){
      sum += a[i];
    }
    
    System.out.println(sum);
    
  }
}
