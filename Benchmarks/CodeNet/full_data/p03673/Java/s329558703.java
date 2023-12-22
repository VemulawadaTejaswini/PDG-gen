import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];

    for(int i = 0 ; i < n ; ++i){
      a[i] = sc.nextInt();
      int k = 0;
      for(int j = i ; j >= 0 ; --j){
        
        b[k] = a[j];
        k++;
      }
      
      a = b.clone();
    }
      
    for(int i = 0 ; i < n ; ++i){
      System.out.print(a[i]);
      System.out.print(" ");
    }

  }
}