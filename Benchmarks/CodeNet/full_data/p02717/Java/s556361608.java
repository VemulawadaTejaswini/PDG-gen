import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[] = new int[n];
    int total = 0;
    int count = 0;
    for(int i=0 ; i<n ; i++){
      a[i] = sc.nextInt();
      total = total + a[i];
    }
    for(int i=0 ; i<n ; i++){
      if(a[i] >= total/(m*4)){
        count++;
      }
    }
    if(count >= m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
