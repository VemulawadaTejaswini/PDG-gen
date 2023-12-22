import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    boolean ans = true;
    int tmp = 0;
    for(int i = 0;i < n;i++){
      h[i] = sc.nextInt();
    }
    for(int j = 0;j < n;j++){
      if(tmp < h[j]){
        h[j]--;
        tmp = h[j];
      }else if(tmp > h[j]){
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
