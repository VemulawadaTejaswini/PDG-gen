import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n-1];
    for(int i=0 ; i<n-1 ; i++){
      a[i] = sc.nextInt();
    }

    for(int i=1 ; i<=n ; i++){
      int count = 0;
      for(int j=0 ; j<n-1 ; j++){
        if(a[j]==i){
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
