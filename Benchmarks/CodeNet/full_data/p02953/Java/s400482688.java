import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    boolean ans = true; 
    for(int i = 0;i < n;i++){
      h[i] = sc.nextInt();
    }
    for(int j = n - 1;j > 0;j--){
      if(h[j] - h[j-1] != 0 && h[j] - h[j-1] != 1){
        ans = false;
        break;
      }
    }
    if(ans){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}