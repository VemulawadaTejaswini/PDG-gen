import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int a[] =new int[n];
    int b[] =new int[n-1];
    int count = 0;
    
    //入力値を配列に格納
    for(int i = 0; i < n-1; ++i){
      b[i] = sc.nextInt();
    }
    
    a[0] = b[0];
    a[n-1] = b[n-2];
    
    for(int i = 1; i < n-1; ++i){
      a[i] = Math.min(b[i-1],b[i]);
    }
    
    
    for(int i = 0; i < n; ++i){
      count += a[i];
    }

    System.out.println(count);
  }
}