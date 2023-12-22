import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    for(int i = 0;i<n;i++){
      h[i] = sc.nextInt();
    }
    boolean check = false;
    for(int i = n-1;i>0;i--){
      if(h[i-1] > h[i]){
        h[i-1]--;
        if(h[i-1]!=h[i]){
          check = true;
          break;
        }
      }
    }
    if(check){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}
